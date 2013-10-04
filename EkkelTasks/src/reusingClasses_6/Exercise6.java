/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test62();

    }

}
class Test61{
    Test61(int i){
	System.out.println("Constract Test61 with i = "+ i );
    }
}
class Test62 extends Test61{
    Test62(){
	super(1);
	System.out.println("Create Test62");
    }
}
