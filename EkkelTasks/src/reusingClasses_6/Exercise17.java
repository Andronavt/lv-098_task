/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Anfibian2 obj = new Frog2();
	obj.move();

    }

}
class Anfibian2{
    public void move(){
	System.out.println("Amfibian Moving");
    }
}
class Frog2 extends Anfibian2{
    public void move(){
	System.out.println("Frog Moving");
    }
}