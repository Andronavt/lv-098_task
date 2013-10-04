/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
class InitTest1 {
    InitTest1(String s) {
	System.out.println("InitTest()");
	System.out.println(s);
    }
}

public class Example17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	InitTest1[] it = new InitTest1[10];
	for (int i = 0; i < it.length; i++) {
	    it[i] = new InitTest1(String.valueOf(i));
	}

    }

}
