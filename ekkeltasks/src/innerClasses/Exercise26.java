/**
 * 
 */
package innerClasses;

/**
 * @author Andrew (2) 
 *         Create a class with an inner class that has a non-default
 *         constructor (one that takes arguments). Create a second class with an
 *         inner class that inherits from the first inner class.
 */
class A26 {
    class Inner {
         Inner(int k)
         {
           System.out.println(k);  
         }
    }
}
class A266
{
    class Inner1 extends A26.Inner
    {
	Inner1()
	{
	   new A26().super(2);
	}
    }
}

public class Exercise26 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        A266.Inner1 a = new A266().new Inner1();
    }

}
