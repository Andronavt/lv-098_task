package eckel.everythingisanobject;

/*
 * Turn the Incrementable code fragments into a working program. 
 */

public class Incrementable {

    static void increment() {
	StaticTest.i++;
    }

    public static void main(String[] args) {
	Incrementable incrementable = new Incrementable();
	System.out.println("before increment i: " + StaticTest.i);
	incrementable.increment();
	System.out.println("after increment i: " + StaticTest.i);

    }

}
