/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	//System.out.println(new Test8.InnerTest8().i); // i is not visible from Test8
	//System.out.println(new Test8.InnerTest8().method()); // method() is not visible from Test8

    }

}
class Test8{
    class InnerTest8{
	private int i;
	private void method(){
	    System.out.println("InnerTest7.method()");
	}
    }
}
