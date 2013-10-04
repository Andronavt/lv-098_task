/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

}

interface Itest6 {
    void f();

    void g();

}

class Test6 implements Itest6 {
    @Override
    public void f() {
    }

    /*
     * Must be public If not public then we have error - Cannot reduce the
     * visibility of the inherited method from Itest6
     */

    @Override
    public void g() {
    }
}
