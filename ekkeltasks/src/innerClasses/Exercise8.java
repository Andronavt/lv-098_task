/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    class Inner
    {
	private int b=10;
	private void print()
	{
	    System.out.println(b);
	}
    }
    public void change()
    {
	Inner d = new Inner();
	d.b = 25;
	d.print();
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise8 e = new Exercise8();
	e.change();

    }

}
