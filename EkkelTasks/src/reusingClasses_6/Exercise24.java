/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise24 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Beetle obj = new Beetle();
	obj.main(args);

    }

}

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
	System.out.println("i = " + i + ", j = " + j);
	j = 39;
    }

    static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
	System.out.println(s);
	return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
	System.out.println("k = " + k);
	System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
	System.out.println("Beetle constructor");
	Beetle b = new Beetle();
    }
}
