/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */

class Detergent {
    // Change a method:
    public void scrub() {
	System.out.println("class Detergent - scrub()");
    }
}

class Test2 extends Detergent {
    @Override
    public void scrub() {
	// TODO Auto-generated method stub
	System.out.println("class Test2 - scrub()");
    }

    public void sterilize() {
	System.out.println("sterilize()");
    }
}

public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
