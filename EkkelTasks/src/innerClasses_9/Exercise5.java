/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test4();

    }

}

class Test4 {
    Test4() {
	System.out.println("Test4");
    }

    class InTest4 {
	InTest4() {
	    System.out.println("InTest4");
	}
    }

    InTest4 obj = new InTest4();
}
