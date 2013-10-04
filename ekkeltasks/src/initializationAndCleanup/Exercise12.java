/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 *
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        // Proper cleanup: empty tank before going home
        tank2.empty();
        // Drop the reference, forget to cleanup:
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.isFull();
        System.out.println("tank2: ");
        tank2.isFull();
        System.out.println("tank3: ");
        tank3.isFull();
        System.out.println("first forced gc():");
        System.gc();
    }

}
class Tank {
    int Full = 0;
    Tank() { this(0); }
    Tank(int fullness) {
            Full = fullness;             
    }
    void isFull() {
            if(Full == 0) System.out.println("Tank is empty");
            else System.out.println("Tank filling status = " + Full);
    }
    void empty() {
            Full = 0;
    }
    protected void finalize() {
            if(Full != 0)
                    System.out.println(" Error: Tank not empty");
    }
}