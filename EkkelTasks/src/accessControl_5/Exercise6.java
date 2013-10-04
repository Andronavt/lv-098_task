/**
 * 
 */
package accessControl_5;

/**
 * @author Богдан
 * 
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test6 obj = new Test6();
	manipul(obj, 5);

    }

    static void manipul(Test6 obj, int x) {
	obj.a = x;
	System.out.println("Field of Test6 is:" + obj.a);
    }

}

class Test6 {
    protected int a;
}
