/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise5 {
	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();

		spot.name = "spot";
		spot.says = "Ruff!";

		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
	}
}

class Dog {
	public String name;
	public String says;
}