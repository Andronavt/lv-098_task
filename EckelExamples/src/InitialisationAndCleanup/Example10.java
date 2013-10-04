/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */
class FinClass{
    FinClass()
    {
	System.out.println("Creating...");
    }
    protected void finalize()
    {
	System.out.println("Finalizing...");
    }
}
public class Example10 {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
	FinClass a= new FinClass();
		
	
	
    }

}
