/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 * 
 */
public class Exercise7 {
    public static void main(String[] args) {
	System.out.println("i => " + StaticTest.i);
	Incrementable.increment();
	System.out.println("i++ => " + StaticTest.i);
    }
}

class Incrementable {
    static void increment() {
    	StaticTest.i++;
    }
}

class StaticTest { 
	 static int i = 45; 
}
