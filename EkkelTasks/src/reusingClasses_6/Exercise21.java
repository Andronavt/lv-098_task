/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}

class Test21 {
    private void method() {
	System.out.println("Test21 - method2");
    }
}

class Test201 extends Test20 {
    private void method() {
	System.out.println("Test211 - method1");
    }
}
