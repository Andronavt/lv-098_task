/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */

class A
{
    class B
    {
	B()
	{
	    System.out.println("working");
	}
    }
}

public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	A a = new A();
	A.B b = a.new B();
    }

}
