/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 *
 */
class First{
    void firstmethod(){
	System.out.println("first method");
	secmethod();
    }
    void secmethod(){
	System.out.println("second method");
    }
}
class Second extends First{
    void secmethod(){
	System.out.println("secmethod over");
    }
}
public class Example10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	First f = new Second();
	f.firstmethod();
	f.secmethod();
	
	
    }

}
