/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
class InitTest {
    InitTest(String s) {
	System.out.println("InitTest()");
	System.out.println(s);
    }
}

public class Example16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	InitTest[] it = new InitTest[10];
    }
}
