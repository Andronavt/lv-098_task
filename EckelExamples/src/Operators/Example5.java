/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
class Dog {
    String name;
    String says;

    Dog() {

    }

    Dog(String name, String says) {
	this.name = name;
	this.says = says;
    }

    public String toString() {
	return ("The name of this dog is " + name + " ,it says " + says);
    }
}

public class Example5 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	Dog a = new Dog("spot", "Ruff!");
	Dog b = new Dog("scruffy", "Wurf!");
	System.out.println(a);
	System.out.println(b);

    }

}
