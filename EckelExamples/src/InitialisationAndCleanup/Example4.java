/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */

class noArgsConst {
    public noArgsConst(String s) {
	System.out.println(s);
    }
}
public class Example4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	noArgsConst a= new noArgsConst("Overloaded constructor");
    }

}
