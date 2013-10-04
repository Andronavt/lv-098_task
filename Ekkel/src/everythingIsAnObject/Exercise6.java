/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 * 
 */
public class Exercise6 {
    public static void main(String[] args) {
	Storage s = new Storage();
	System.out.print("String storage => " + s.storage("Storage"));
    }
}

class Storage {
    int storage(String s) {
	return s.length() * 2;
    }
}
