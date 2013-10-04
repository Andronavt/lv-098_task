/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
class A15
{
    int b;
    A15(int b)
    {
	this.b = b;
    }
    void show()
    {
	System.out.println(b);
    }
    
}
class B15
{
    A15 a15(int k)
    {
	return new A15(k){};
    }
}
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        B15 k = new B15();
        k.a15(15).show();
    }

}
