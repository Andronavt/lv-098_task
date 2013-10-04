/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		print(s);
		return 47;
	}
}

class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");

	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
}

class Bees extends Beetle {
	private int k = printInit("Bees.k initialized");

	public Bees() {
		print("k = " + (k + 5));
		print("j = " + (j + 6));
	}
	private static int x2 = printInit("static Bees.x2 initialized");
}

public class Exercise24 {
	public static void main(String[] args) {
		print("Bees constructor");
		Bees b = new Bees();
	}
}
/*
 * In Beetle.java, inherit a specific type of beetle from class Beetle,
 * following the same format as the existing classes. Trace and explain the
 * output
 */