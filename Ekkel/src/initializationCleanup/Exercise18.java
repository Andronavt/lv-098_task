/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise18 {
	public static void main(String[] args) {
		StrArg[] sa = new StrArg[5];
		for(int i = 0; i < sa.length; i++){
			sa[i] = new StrArg("OrestO " + i);
		}
	}

}
