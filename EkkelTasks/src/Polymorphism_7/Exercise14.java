/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Characteristic2 c = new Characteristic2("Animal");
	new Rodent3(c);
	new Mouse3(c);
	new Gerbil3(c);
	new Humster3(c);
	System.out.println("Refcount on c is: "+ c.getRefCount());

    }

}

class Characteristic2 {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    private String s;

    Characteristic2(String s) {
	this.s = s;
	System.out.println("Create Characteristic " + s);
    }

    public void addRef() {
	refcount++;
    }
    public int getRefCount(){
	return refcount;
    }
}

class Description2 {
    private String s;

    public Description2(String s) {
	this.s = s;
	System.out.println("Create Description " + s);
    }
}

class Rodent3 {
    private Characteristic2 c;
    Description2 d = new Description2("Rodent Description");

    public Rodent3(Characteristic2 c) {
	System.out.println("Create Rodent");
	this.c = c;
	this.c.addRef();
    }

    void eat() {
	System.out.println("Rodent eat food");
    }

    void drink() {
	System.out.println("Rodent drink wather");
    }
}

class Mouse3 extends Rodent3 {
    private Characteristic2 c;
    Description2 d = new Description2("Mouse2 Description");

    public Mouse3(Characteristic2 c) {
	super(c);
	System.out.println("Create Mouse");
	this.c = c;
	this.c.addRef();
    }

    @Override
    void eat() {
	System.out.println("Mouse eat food");
    }

    @Override
    void drink() {
	System.out.println("Mouse eat food");
    }
}

class Gerbil3 extends Rodent3 {
    private Characteristic2 c;
    Description2 d = new Description2("Gerbil2 Description");

    public Gerbil3(Characteristic2 c) {
	super(c);
	System.out.println("Create Gerbil");
	this.c = c;
	this.c.addRef();
    }

    @Override
    void eat() {
	System.out.println("Gerbil eat food");
    }

    @Override
    void drink() {
	System.out.println("Gerbil eat food");
    }
}

class Humster3 extends Rodent3 {
    private Characteristic2 c;
    Description2 d = new Description2("Humster2 Description");

    public Humster3(Characteristic2 c) {
	super(c);
	System.out.println("Create Humster");
	this.c = c;
	this.c.addRef();
    }

    @Override
    void eat() {
	System.out.println("Humster eat food");
    }

    @Override
    void drink() {
	System.out.println("Humster eat food");
    }
}
