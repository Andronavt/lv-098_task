/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author orecto
 * 
 */
/*
 * Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the
 * Rodents and an Iterator to move through the sequence of Rodents
 */
public class Exercise10 {
	public static void main(String[] args) {
		ArrayList<Rodent> list = new ArrayList<Rodent>();
		int size = 5;
		
		for(int i = 0; i < size; i++){
			list.add(new Rodent());
		}
		
		Iterator<Rodent> it = list.iterator();
		while(it.hasNext()){
			Rodent r = it.next();
			r.eat();
			System.out.println("count => " + r.getCount());
			System.out.println("ID => " + r.getId());
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

class Test extends Rodent {
	ObjDemo od;

	Test() {
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