/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();

		spot.name = "spot";
		spot.says = "Ruff!";

		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";

		Dog newDog;
		newDog = spot;

		System.out.println("spot == newDog => " + (spot == newDog));
		System.out.println("spot.equals(newDog) => " + spot.equals(newDog));
	}

}
