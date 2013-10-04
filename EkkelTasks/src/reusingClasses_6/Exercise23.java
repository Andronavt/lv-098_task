/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise23 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test23();

    }

}
class Test23{
    static int field = printInt("static field inicialised");
    
    private static int printInt(String s){
	System.out.println(s);
	return 10;
    }
    Test23(){
	System.out.println("Object of class Test23 created");
    }
}
