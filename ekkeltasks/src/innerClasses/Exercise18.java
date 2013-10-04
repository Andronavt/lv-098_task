/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
class A18
{
   static class B18
    {
	B18()
	{
	    System.out.println("Nested Class!");
	}
    }
}
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        A18.B18 nested = new A18.B18();
    }

}
