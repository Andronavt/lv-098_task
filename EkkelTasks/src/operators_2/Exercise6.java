/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog dog1 = new Dog("spot", "Ruff!");
	Dog dog2 = new Dog("spot", "Ruff!");
	System.out.println(" Compare of two same object Dogs by == returns: "
		+ equals1(dog1, dog2));
	System.out.println(" Compare of two same object Dogs by equals() returns: "
		+ equals2(dog1, dog2));

    }

    /**
     * This method compare two Dog object by ==
     * 
     * @param d1
     *            Dog object
     * @param d2
     *            Dog object
     * @return result in String
     */
    public static String equals1(Dog d1, Dog d2) {
	return (d1 == d2 ? "same" : "different");
    }

    /**
     * This method compare two Dog object by equals()
     * 
     * @param d1
     *            Dog object
     * @param d2
     *            Dog object
     * @return result in String
     */
    public static String equals2(Dog d1, Dog d2) {
	return (d1.equals(d2) ? "same" : "different");
    }

}
