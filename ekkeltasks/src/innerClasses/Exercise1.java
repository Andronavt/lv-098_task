/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
class Outer
{
    class Inner
    {
	
    }
    Inner getInner()
    {
	return new Inner();
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
       Outer c = new Outer();
       Inner i = c.getInner();
    }
}
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
    }

}
