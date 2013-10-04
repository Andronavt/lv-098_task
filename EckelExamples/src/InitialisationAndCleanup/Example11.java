/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */
class FinClass1{
    FinClass1()
    {
	System.out.println("Creating...");
    }
    protected void finalize()
    {
	System.out.println("Finalizing...");
    }
}
public class Example11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	FinClass1 a= new FinClass1();
	
	System.runFinalizersOnExit(true);
    }

}
