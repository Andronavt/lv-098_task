/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 *
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
         new OverlConstr("I am", 21);
    }

}
class OverlConstr
{
    OverlConstr(String a)
    {
	System.out.println(a);
    }
    OverlConstr(String a, int b)
    {
	this(a);
	System.out.println(b);
    }
}
