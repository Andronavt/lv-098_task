/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 *
 */
class StatDemo{
    static String a= "aaa";
    static String b;
    static{
	b= "bbb";
    }
    public static void out()
    {
	System.out.println(a+" "+b);
    }
}
public class Example14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	StatDemo.out();
    }

}
