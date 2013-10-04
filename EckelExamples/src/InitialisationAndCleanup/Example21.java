/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */

public class Example21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for(MyCurency a: MyCurency.values())
	{
	    System.out.println(a+" ordinal "+ a.ordinal());
	}

    }

}
