/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class Test18 {
    static final int k = 5;
    final int d;

    Test18() {
	d = 10;
    }
}

public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	System.out.println(Test18.k);
	System.out.println(new Test18().d);

    }

}
