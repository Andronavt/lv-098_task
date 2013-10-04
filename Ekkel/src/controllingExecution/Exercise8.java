/**
 * 
 */
package controllingExecution;

/**
 * @author orecto
 * 
 */
public class Exercise8 {
	public static void main(String[] args) {
		CaseTry.withBreak();
		CaseTry.withoutBreak();
	}
}

class CaseTry {
	public static void withBreak() {
		System.out.println("method with breaks:");
		for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.print(1 + " ");
				break;
			case 2:
				System.out.print(2 + " ");
				break;
			case 3:
				System.out.print(3 + " ");
				break;
			case 4:
				System.out.print(4 + " ");
				break;
			case 5:
				System.out.print(5 + " ");
				break;
			case 6:
				System.out.print(6 + " ");
				break;
			case 7:
				System.out.print(7 + " ");
				break;
			case 8:
				System.out.print(8 + " ");
				break;
			case 9:
				System.out.print(9 + " ");
				break;
			}
			System.out.println("end of itteration " + i);
		}
	}

	public static void withoutBreak() {
		System.out.println("method without breaks:");
		for (int i = 1; i < 10; i++) {
			switch (i) {
			case 1:
				System.out.print(1 + " ");
			case 2:
				System.out.print(2 + " ");
			case 3:
				System.out.print(3 + " ");
			case 4:
				System.out.print(4 + " ");
			case 5:
				System.out.print(5 + " ");
			case 6:
				System.out.print(6 + " ");
			case 7:
				System.out.print(7 + " ");
			case 8:
				System.out.print(8 + " ");
			case 9:
				System.out.print(9 + " ");
			}
			System.out.println("end of itteration " + i);
		}
	}
}
/*
 * Create a switch statement that prints a message for each case, and put the
 * switch inside a for loop that tries each case. Put a break after each case
 * and test it, then remove the breaks and see what happens.
 */
