/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
interface A20
{
    void printsome();

    static class B20 implements A20
    {
	public void printsome()
	{
	    System.out.println("Class B20 - print some");
	}
    }
}
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        A20.B20 inner = new A20.B20();
        inner.printsome();
    }

}
