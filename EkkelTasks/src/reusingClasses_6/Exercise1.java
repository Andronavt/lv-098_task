/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test1();

    }

}

class Test1 {
    Test1() {
	System.out.println("Test1");
    }
    Test2 obj = new Test2();
}
class Test2{
    Test2() {
	System.out.println("Test2");
    }
}
