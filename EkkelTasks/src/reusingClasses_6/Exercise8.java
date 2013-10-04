/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test82();
	System.out.println();
	new Test82(10);

    }

}

class Test81 {
    Test81(int i) {
	System.out.println("Create Test81 with i = " + i);
    }
}

class Test82 extends Test81 {
    Test82() {
	super(5);
	System.out.println("Create Test82 with no args");
    }

    Test82(int i) {
	super(i);
	System.out.println("Create Test82 with i =" + i);
    }
}
