/**
 * 
 */
package everythingIsAnObject;

/**
 * @author Andrew
 * 
 */
public class Exercise7 {
    public static void main(String[] args) {
	Incrementable.increment();
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
	StaticTest.i++;
    }
}
