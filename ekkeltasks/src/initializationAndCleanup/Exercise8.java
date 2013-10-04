/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Twomethods().fist();

    }

}
class Twomethods
{
    public void fist()
    {
	System.out.println("Works");
    }
    public void second()
    {
	this.second();
    }
}