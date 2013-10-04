/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class Detergent
{
void scrub(){
    System.out.println("detergent scrub");
}
}
class MyClass{
    void scrub(){
	System.out.println("MyClass scrub");
    }
    void sterilize(){
	System.out.println("sterilize");
    }
}
public class Example2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Detergent d= new Detergent();
	d.scrub();
	MyClass a= new MyClass();
	a.scrub();
    a.sterilize();
    }

}
