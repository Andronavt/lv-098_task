/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
class Tank {
    int emptyness;

    Tank() {
	this(0);
    }

    Tank(int emptyness) {
	this.emptyness = emptyness;
    }

    void tell() {
	if (emptyness == 0)
	    System.out.println("Empty");
	else
	    System.out.println("It has " + emptyness);
    }

    protected void finalize() {
if(emptyness!=0)
    System.out.println("NOT EMPTY");
    }

}

public class Example12 {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Tank a= new Tank();
	Tank b = new Tank(2);
	Tank c= new Tank(4);
	new Tank(10);
	a.tell();
	b.tell();
	c.tell();
	System.out.println("GC");
	System.gc();
	System.out.println("Finalize on exit");
	System.runFinalizersOnExit(true);
	System.out.println("GC One more");
	System.gc();
	
	
	
	
    }

}
