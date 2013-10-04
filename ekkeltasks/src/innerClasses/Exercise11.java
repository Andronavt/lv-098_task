/**
 * 
 */
package innerClasses;
/**
 * @author Andrew
 *
 */


class Exercise111{

    private class Inner implements Exe11
    {
	public void print(){
	    System.out.println("yeah!");
	}
    }
    Exe11 getInner()
    {
	return new Inner();
    }
    /**
     * @param args
     */

}
public class Exercise11
{
    public static void main(String[] args) {
	// TODO Auto-generated method stub
           Exercise111 k = new Exercise111();
           k.getInner().print();
           // Error: cannot find symbol: class Inner:
           //((Inner)k.getInner()).print();
        
       
    }

}
