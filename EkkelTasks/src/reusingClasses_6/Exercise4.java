/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Sub();

    }

}
class Base{
    Base(){
	System.out.println("Base constructor");
    }
}
class Sub extends Base{
    Sub(){
	System.out.println("Sub constructor");
    }
}