/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */

/*
 * Create a Cycle interface, with implementations Unicycle, Bicycle and
 * Tricycle. Create factories for each type of Cycle, and code that uses these
 * factories
 */
public class Exercise18 {
	public static void rideCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride(c);
	}
	public static void main(String [] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());	
	}
}

interface Cycle{
	void ride(Cycle c);
}

interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public void ride(Cycle c){
		System.out.println(c.getClass().getName());
	}
}

class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}
class Bicycle implements Cycle{
	public void ride(Cycle c){
		System.out.println(c.getClass().getName());
	}
}

class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	public void ride(Cycle c){
		System.out.println(c.getClass().getName());
	}
}

class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}
