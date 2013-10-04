/**
 * 
 */
package operators;

/**
 * @author Andrew
 *
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dog dog1 = new Dog("spot","Ruff!");
	Dog dog2 = new Dog("scruffy","Wurf!");
	Dog dog3 = dog1;
	System.out.println(dog3.equals(dog3));
	System.out.println(dog3.equals(dog2));

    }

}
