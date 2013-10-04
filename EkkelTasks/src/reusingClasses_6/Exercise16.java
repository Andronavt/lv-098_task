/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Anfibian obj = new Frog();
	obj.move();

    }

}
class Anfibian{
    public void move(){
	System.out.println("Amfibian Moving");
    }
}
class Frog extends Anfibian{
    
}
