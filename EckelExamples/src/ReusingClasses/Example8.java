/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class BaseClass
{
    public BaseClass(int a) {
	System.out.println(a);
    }
}
class DerivedClass extends BaseClass{

    int b;
    public DerivedClass(int a,int b) {
	super(a);
	this.b=b;
	
    }
}
public class Example8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DerivedClass d= new DerivedClass(1, 2);
    }

}
