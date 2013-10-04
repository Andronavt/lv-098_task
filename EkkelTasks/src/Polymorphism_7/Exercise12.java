/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Rodent2[] array = new Rodent2[] { new Gerbil2(), new Humster2(),
		new Mouse2() };

    }

}

class Characteristic {
    private String s;

    Characteristic(String s) {
	this.s = s;
	System.out.println("Create Characteristic " + s);
    }
}

class Description {
    private String s;

    public Description(String s) {
	this.s = s;
	System.out.println("Create Description " + s);
    }
}

class Rodent2 {
    Characteristic c = new Characteristic("Rodent Characteristic");
    Description d = new Description("Rodent Description");

    public Rodent2() {
	System.out.println("Create Rodent");
    }

    void eat() {
	System.out.println("Rodent eat food");
    }

    void drink() {
	System.out.println("Rodent drink wather");
    }
}

class Mouse2 extends Rodent2 {
    Characteristic c = new Characteristic("Mouse2 Characteristic");
    Description d = new Description("Mouse2 Description");

    public Mouse2() {
	System.out.println("Create Mouse");
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

class Gerbil2 extends Rodent2 {
    Characteristic c = new Characteristic("Gerbil2 Characteristic");
    Description d = new Description("Gerbil2 Description");

    public Gerbil2() {
	System.out.println("Create Gerbil");
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

class Humster2 extends Rodent2 {
    Characteristic c = new Characteristic("Humster2 Characteristic");
    Description d = new Description("Humster2 Description");

    public Humster2() {
	System.out.println("Create Humster");
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