package eckel.operators;

/*
 * Create a class called Dog containing two Strings: anme and says.In main(), create two dog objects with names 
 * "spot" (who says, "Ruff!") and "scruffy" (who says, "Wurf!").Then display ther names and what they say.
 * Following Exercise 5, create a new Dog reference and assign it to spot's object. Test for comparison using
 *  == and 
 * equeal() for all references.
 */
public class Dog {
    private String name;
    private String says;

    Dog(String name, String says) {
	this.name = name;
	this.says = says;
    }

    public String toString() {
	return "name: " + name + " says: " + says;
    }

    public static void main(String[] args) {
	Dog d1 = new Dog("spot", "Ruff!");
	Dog d2 = new Dog("scruff", "Wurf!");
	System.out.println(d1);
	System.out.println(d2);
	Dog newdog;
	newdog = d1;
	System.out.println(d1 == newdog);
	System.out.println(d1.equals(newdog));
	System.out.println(d1.equals(d2));
	System.out.println(d1 == d2);
    }

}
