/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
/*
 * Create three interfaces, each with two methods. Inherit a new interface that
 * combines the three, adding a new method. Create a class by implementing the
 * new interface and also inheriting from a concrete class. Now write four
 * methods, each of which takes one of the four interfaces as an argument. In
 * main( ), create an object of your class and pass it to each of the methods
 */
public class Exercise14 {
	public static void meth1(IWater water) {
		water.dive();
	}

	public static void meth2(IGround ground) {
		ground.dig();
	}

	public static void meth3(IAir air) {
		air.fly();
	}

	public static void meth4(IMan man) {
		man.action();
	}

	public static void main(String[] args) {
		UkrainianMan uMan = new UkrainianMan();
		meth1(uMan);
		meth2(uMan);
		meth3(uMan);
		meth4(uMan);

		uMan.drink();
	}
}

interface IWater {
	void dive();

	void swim();
}

interface IGround {
	void dig();

	void run();
}

interface IAir {
	void fly();

	void fall();
}

interface IMan extends IWater, IGround, IAir {
	void action();
}

class Ukrainian {
	private int salo = 100;
	private long vodka = 200;

	public void drink() {
		System.out.println("drink vodka " + vodka + " l/p.y, " + "eat salo "
				+ salo + " kg/p.y");
	}
}

class UkrainianMan extends Ukrainian implements IMan {

	public void dive() {
		System.out.println("dive");
	}

	public void swim() {
		System.out.println("swim");
	}

	public void fly() {
		System.out.println("fly");
	}

	public void fall() {
		System.out.println("fall");
	}

	public void run() {
		System.out.println("run");
	}

	public void dig() {
		System.out.println("dig");
	}

	public void action() {
		System.out.println("action");
	}
}
