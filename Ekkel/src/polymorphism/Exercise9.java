/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
public class Exercise9 {
	public static void main(String[] args) {
		Rodent[] rodArr = { new Rodent(), new Mouse(), new Gerbil(),
				new Hamster() };
		for (Rodent r : rodArr) {
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

class Rodent {
	ObjDemo od;
	private static long count = 0;
	private final long id = count++;

	Rodent() {
		od = new ObjDemo("Rodent -> creating");
		System.out.println(od.str);
	}

	void eat() {
		System.out.println("Rodent -> eats");
	}

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
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In
 * the base class, provide methods that are common to all Rodents, and override
 * these in the derived classes to perform different behaviors depending on the
 * specific type of Rodent. Create an array of Rodent, fill it with different
 * specific types of Rodents, and call your base-class methods to see what
 * happens
 */