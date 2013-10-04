/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
public class Exercise7 {

	public static void main(String[] args) {
		IRodent[] rodArr = { new Mouse2(), new Gerbil2(), new Hamster2() };
		for (IRodent r : rodArr) {
			r.eat();
		}
	}
}

interface IRodent {
	void eat();
}

class Mouse2 implements IRodent {
	ObjDemo od;

	Mouse2() {
		od = new ObjDemo("Mouse -> creating");
		System.out.println(od.str);
	}

	public void eat() {
		System.out.println("Mouse -> eats");
	}
}

class Gerbil2 implements IRodent {
	ObjDemo od;

	Gerbil2() {
		od = new ObjDemo("Gerbil -> creating");
		System.out.println(od.str);
	}

	public void eat() {
		System.out.println("Gerbil -> eats");
	}
}

class Hamster2 implements IRodent {
	ObjDemo od;

	Hamster2() {
		od = new ObjDemo("Hamster -> creating");
		System.out.println(od.str);
	}

	public void eat() {
		System.out.println("Hamster -> eats");
	}
}
/*
 * Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface
 */