/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test32 obj = new Test32();
	obj.print();
    }

}

abstract class Test3 {
    Test3() {
	print();
    }

    abstract void print();
}

class Test32 extends Test3 {
    int i = 1;

    @Override
    void print() {
	System.out.println("Test32 i = " + i);

    }

}
