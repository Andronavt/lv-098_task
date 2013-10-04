/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test9().returnInter().f();

    }

}

interface InterTest10 {
    void f();
}

class Test10 {
    InterTest10 returnInter() {
	if (true) {
	    class InnerTest10 implements InterTest10 {
		@Override
		public void f() {
		    System.out.println("InnerTest1 f()");
		}
	    }
	    return new InnerTest10();
	}
	return null;
    }
}
