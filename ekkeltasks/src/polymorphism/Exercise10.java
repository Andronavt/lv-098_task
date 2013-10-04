/**
 * 
 */
package polymorphism;

/**
 * @author Andrew
 *
 */
class A
{
    void first()
    {
	second();
    }
    void second()
    {
	System.out.println("SecondA");
    }
}
class B extends A
{
    void second()
    {
	System.out.println("SecondB");
    }
}
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	A a = new B();
	a.second();

    }

}
