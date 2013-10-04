/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise21 {
	public static void main(String[] args) {
		for(PaperCurrency p : PaperCurrency.values()){
			System.out.println(p + "\t=>\t" + p.ordinal());
		}
	}
}
/*
 * Create an enum of the least-valuable six types of paper currency. Loop
 * through the values( ) and print each value and its ordinal( )
 */
