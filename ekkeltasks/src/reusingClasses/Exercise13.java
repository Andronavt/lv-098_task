/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 *
 */
class Test13
{
    void print(String a)
    {
       System.out.println(a);
    }
    void print(String a, int b)
    {
	System.out.println(a + " " + b);
    }
    void print(int b, String a)
    {
	System.out.println(b + " " + a);
    }
}
class Test131 extends Test13
{
    void print(String a,String b)
    {
	System.out.println(a + " " + b);
    }
}
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Test131 test = new Test131();
	test.print("hahaha");
	test.print(15,"sasas");
	test.print("Pryvit","Druge");
	test.print("String", 15);

    }

}
