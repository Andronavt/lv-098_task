/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class FinalValClass{
    public final int a=10;
    public static final int b=100;
}
public class Example18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(FinalValClass.b);
	FinalValClass a= new FinalValClass();
	System.out.println(a.a);
    }

}
