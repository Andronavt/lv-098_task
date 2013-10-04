/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 *
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Outer obj = new Outer();
	obj.createIn();

    }

}
class Outer {
    Outer(){
	System.out.println("Class Outer");
    }
    public Inner createIn(){
	return new Inner();
    }
    class Inner{
	Inner(){
	    System.out.println("Class Inner");
	}
    }
}