/**
 * 
 */
package innerClasses_9;

import innerClasses_9.Test18.NestedTest18;

/**
 * @author Богдан
 *
 */
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test20 obj1 = new Test20();
	NestedTest18 obj2 = new NestedTest18();

    }

}
interface InterTest20{
    static class NestedTest20{
	public NestedTest20() {
	    System.out.println("NestedTest20");
	}
    }
}
class Test20 implements InterTest20{
    public Test20() {
	System.out.println("Test20");
    }
}
