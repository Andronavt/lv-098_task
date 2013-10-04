/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */
interface A21 {
    String meth1();

    String meth2();

    static class B21 {
	static void calls(A21 a) {
	    System.out.println(a.meth1() + a.meth2());

	}
    }
}

public class Exercise21 implements A21 {

    /**
     * @param args
     */
    public String meth1() {
	return "meth1 ";
    }

    public String meth2() {
	return "meth2 ";
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise21 ex = new Exercise21();
	A21.B21.calls(ex);
    }

}
