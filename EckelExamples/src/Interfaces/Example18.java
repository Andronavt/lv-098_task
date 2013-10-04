/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 * 
 */
interface CycleInt {
	void ride();
}
interface FactoryInt {
	CycleInt createCycle();
}
class UniCycleC implements CycleInt {
	public void ride() {
		System.out.println("Riding unicycle");
	}
}
class UniCycleFabric implements FactoryInt{
	public CycleInt createCycle(){
		return new UniCycleC();
	}
}
class BiCycleC implements CycleInt {
	public void ride() {
		System.out.println("Riding BiCycle");
	}
}
class BiCycleFabric implements FactoryInt{
	public CycleInt createCycle() {
		return new BiCycleC();
	}
}
class TriCycleC implements CycleInt {
	public void ride() {
		System.out.println("Riding TriCycle");
	}
}
class TriCycleFabric implements FactoryInt{
	public CycleInt createCycle() {
		return new TriCycleC();
	}
}


public class Example18 {

	public static void ride(FactoryInt factoryelement){
		CycleInt cycleelem = factoryelement.createCycle();
		cycleelem.ride();
	}
	public static void main(String[] args) {
	ride(new BiCycleFabric());
	ride(new TriCycleFabric());
	ride(new UniCycleFabric());
	}

}
