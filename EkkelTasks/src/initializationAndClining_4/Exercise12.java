/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Tank obj = new Tank();
	obj.emptyTank();
	//obj.finalize();
	System.runFinalizersOnExit(true);
	

    }

}
class Tank{
    private boolean isFill;
    private boolean isEmpty;
    Tank(){
	System.out.println("Tank is created and filled up!");
	isFill = true;
    }
    void fillTank(){
	System.out.println("Tank is filled up!");
	isFill = true;
    }
    void emptyTank(){
	if(isFill){
	    System.out.println("Tank is empty!");
	    isFill = false;
	    isEmpty = true;
	}
    }
    
    protected void finalize(){
	if(isEmpty) System.out.println("Tank is empty and destroyed");
    }
}