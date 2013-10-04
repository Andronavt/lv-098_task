/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
/*
 * Modify the previous exercise by creating an abstract class and inheriting
 * that into the derived class
 */
public class Exercise15 {
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
		UkrainianMan1 uMan1 = new UkrainianMan1();
		meth1(uMan1);
		meth2(uMan1);
		meth3(uMan1);
		meth4(uMan1);

		uMan1.drink();
	}
}

abstract class Ukrainian1 {
	private int salo = 120;
	private long vodka = 250;

	public void drink() {
		System.out.println("drink vodka " + vodka + " l/p.y, " + "eat salo "
				+ salo + " kg/p.y");
	}
}

class UkrainianMan1 extends Ukrainian1 implements IMan {

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