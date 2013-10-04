/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */
class ThisUsage{
    void meth1()
    {
	System.out.println("Method1");
	this.meth2();
	meth2();
    }
    void meth2()
    {
	System.out.println("Method2");
    }
}
public class Example8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ThisUsage a= new ThisUsage();
	a.meth1();
    }

}
