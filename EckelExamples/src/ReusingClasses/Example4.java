/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class Aa {
    Aa() {
	System.out.println("A constructor");
    }
}

class Another extends Aa {
    Another() {
	System.out.println("Another constructor");
    }
}

public class Example4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Another b = new Another();
    }

}
