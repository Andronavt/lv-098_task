package Interfaces;

/**
 * 
 */



/**
 * @author Oleg
 * 
 */
class Rodent2 implements RodentInterface {
	public void meth1() {
		System.out.println("Rodent meth1");
	}

	public void meth2() {
		System.out.println("Rodent meth2");
	}
}

class Mouse2 extends Rodent2 {
	public void meth1() {
		System.out.println("Mouse meth1");
	}

	public void meth2() {
		System.out.println("Mouse meth2");
	}
}

class Gerbil2 extends Rodent2 {
	public void meth1() {
		System.out.println("Gerbil meth1");
	}

	public void meth2() {
		System.out.println("Gerbil meth2");
	}
}

public class Example7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rodent2[] a = new Rodent2[]{(Rodent2) new Gerbil2(), (Rodent2) new Mouse2(), (Rodent2) new Rodent2()};
		for (Rodent2 b : a) {
			b.meth1();
			b.meth2();
		}
	}

}
