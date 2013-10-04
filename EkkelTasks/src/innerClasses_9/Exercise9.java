/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test9().returnInter().f();

    }

}

interface InterTest9 {
    void f();
}

class Test9 {
    InterTest9 returnInter() {
	class InnerTest9 implements InterTest9 {
	    @Override
	    public void f() {
		System.out.println("InnerTest9 f()");
	    }
	}
	return new InnerTest9();
    }
}
