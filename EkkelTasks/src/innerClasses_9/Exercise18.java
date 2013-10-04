/**
 * 
 */
package innerClasses_9;

import innerClasses_9.Test18.NestedTest18;

/**
 * @author Богдан
 *
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new NestedTest18();

    }

}
class Test18{
    public Test18() {
	System.out.println("Test18");
    }
    static class NestedTest18{
	public NestedTest18() {
	    System.out.println("NestedTest18");
	}
    }
}
