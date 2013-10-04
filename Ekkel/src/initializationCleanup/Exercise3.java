/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise3 {
	public static void main(String[] args) {
		ConstrDemo cd = new ConstrDemo();
	}
}

class ConstrDemo {
	/**
	 * 
	 */
	public ConstrDemo() {
		System.out.println("ConstrDemo - constructor");
	}
	
	public ConstrDemo(String str){
		System.out.println(str);
	}
}