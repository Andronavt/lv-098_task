/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise21 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test21 obj1 = new Test21();
	Test21.NestedTest21 obj2 = new Test21.NestedTest21();
	obj2.method(obj1);
    }

}

interface InterTest21 {

    static class NestedTest21 {

	public NestedTest21() {
	    System.out.println("NestedTest20");
	}

	static void method(InterTest21 it) {
	    it.a();
	    it.b();

	}
    }

    void a();

    void b();
}

class Test21 implements InterTest21 {
    @Override
    public void a() {
	System.out.println(" Test21 a()");

    }

    @Override
    public void b() {
	System.out.println("Test21 b()");

    }
}