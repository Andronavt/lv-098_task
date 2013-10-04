/**
 * 
 */
package EverythingIsAnObject;

/**
 * @author Oleg
 * 
 */

class Prove {
    static int a = 1;

    Prove() {
	a++;
    }
}

public class Example8 {
    public static void main(String[] args) {
	Prove val1 = new Prove();
	System.out.println(val1.a);
	Prove val2 = new Prove();
	System.out.println(val2.a);

    }
}
