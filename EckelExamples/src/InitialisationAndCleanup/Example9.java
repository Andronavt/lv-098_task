/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */
class OverlConstr{
    OverlConstr(int i){
	System.out.println(i);
    }
    OverlConstr(String s,int i)
    {
	this(i);
	System.out.println(s);
    }
}
public class Example9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	OverlConstr a= new OverlConstr("ads",1);
    }

}
