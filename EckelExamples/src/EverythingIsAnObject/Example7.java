/**
 * 
 */
package EverythingIsAnObject;

/**
 * @author Oleg
 * 
 */

class IntValClass {

    static int i = 10;
}

class Incrementable {
    static void increment() {
	IntValClass.i++;
    }
}

public class Example7 {
    public static void main(String[] args) {
    Incrementable.increment();
    }
}
