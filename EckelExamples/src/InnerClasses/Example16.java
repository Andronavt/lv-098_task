/**
 * 
 */
package InnerClasses;

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
	public static FactoryInt factory = new FactoryInt() {

		public CycleInt createCycle() {
			return new UniCycleC();
		}
	};
}

class BiCycleC implements CycleInt {
	public void ride() {
		System.out.println("Riding BiCycle");
	}
	public static FactoryInt factory = new FactoryInt() {

		public CycleInt createCycle() {
			return new BiCycleC();
		}
	};
}

class TriCycleC implements CycleInt {
	public void ride() {
		System.out.println("Riding TriCycle");
	}
	public static FactoryInt factory = new FactoryInt() {

		public CycleInt createCycle() {
			return new TriCycleC();
		}
	};
}

public class Example16 {
	public static void ride(FactoryInt factoryelement) {
		CycleInt cycleelem = factoryelement.createCycle();
		cycleelem.ride();
	}
	public static void main(String[] args) {
		ride(BiCycleC.factory);
		ride(TriCycleC.factory);
		ride(UniCycleC.factory);
	}

}
