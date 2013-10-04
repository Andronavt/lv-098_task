/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
public class Exercise1 {
	public static void main(String[] args) {
		Rodent[] rodent = { new Mouse(), new Hamster(), new Gerbil() };

		for (Rodent r : rodent) {
			r.eat();
		}
	}

}

class ObjDemo {
	String str;

	ObjDemo(String str) {
		this.str = str;
	}
}

abstract class Rodent {
	ObjDemo od;
	private static long count = 0;
	private final long id = count++;

	Rodent() {
		od = new ObjDemo("Rodent -> creating");
		System.out.println(od.str);
	}

	abstract void eat();

	long getId() {
		return id;
	}

	long getCount() {
		return count;
	}
}

class Mouse extends Rodent {
	ObjDemo od;

	Mouse() {
		od = new ObjDemo("Mouse -> creating");
		System.out.println(od.str);
	}

	@Override
	void eat() {
		System.out.println("Mouse -> eats");
	}
}

class Gerbil extends Rodent {
	ObjDemo od;

	Gerbil() {
		od = new ObjDemo("Gerbil -> creating");
		System.out.println(od.str);
	}

	@Override
	void eat() {
		System.out.println("Gerbil -> eats");
	}
}

class Hamster extends Rodent {
	ObjDemo od;

	Hamster() {
		od = new ObjDemo("Hamster -> creating");
		System.out.println(od.str);
	}

	@Override
	void eat() {
		System.out.println("Hamster -> eats");
	}
}
/*
 * Modify Exercise 9 in the previous chapter so that Rodent is an abstract
 * class. Make the methods of Rodent abstract whenever possible.
 */