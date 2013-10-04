/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise7 {
	public static void main(String[] args) {
		PrinterV2.print();
	}
}

class PrinterV2 {
	public static void print() {
		for (int i = 1; i <= 100; i++) {
			if (i == 99)
				break;
			else
				System.out.println(i);
		}
	}
}
/*
 * Modify Exercise 1 so that the program exits by using the break keyword at
 * value 99. Try using return instead.
 */
