/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise1 {
	protected void protectedShow(){
		System.out.println("protected void protectedShow()");
	}
	public static void main(String[] args) {
		Printer.print();
	}

}

class Printer {
	static void print() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
