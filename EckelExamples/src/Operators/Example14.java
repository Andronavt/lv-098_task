/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
public class Example14 {

    public static void compareStrings(String val1, String val2) {
	System.out.println(val1 == val2);
	System.out.println(val1 != val2);
	System.out.println(val1.equals(val2));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	String val1 = "aaa";
	String val2 = "bbb";
	String val3 = "aaa";
	compareStrings(val1, val2);
	compareStrings(val1, val3);

    }

}
