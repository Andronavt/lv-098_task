/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 *
 */

abstract class Test3
{
    Test3()
    {
	print();
    }
   abstract void print(); 
}
class Test33 extends Test3
{
    int k = 5;
    @Override
    void print()
    {
	System.out.println(k);
    }
}
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Test33 k = new Test33();
	k.print();

    }

}
