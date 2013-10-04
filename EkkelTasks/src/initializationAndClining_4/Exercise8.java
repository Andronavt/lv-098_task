/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test8 obj = new Test8();
	obj.firstMethod();

    }

}
class Test8{
    void firstMethod(){
	secondMethod();
	this.secondMethod();
    }
    void secondMethod(){
	System.out.println("Second method called");
    }
}
