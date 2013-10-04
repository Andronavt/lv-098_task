/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise22 {
	public static void main(String[] args) {
		PaperCurrency pc = PaperCurrency.FIVE_DOLLARS;
		switch (pc) {
		case ONE_DOLLAR:
			System.out.println(pc);
			break;
		case FIVE_DOLLARS:
			System.out.println(pc);
			break;
		case TEN_DOLLARS:
			System.out.println(pc);
			break;
		case TWENTY_DOLLARS:
			System.out.println(pc);
			break;
		case FIFTY_DOLLARS:
			System.out.println(pc);
			break;
		case HUNDRED_DOLLARS:
			System.out.println(pc);
			break;
		}
	}
}
/*
 * Write a switch statement for the enum in the previous example. For each case,
 * output a description of that particular currency
 */