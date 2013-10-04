/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	compareStrings("cat","dog");
	compareStrings("mouse","mouse");
    }

    static void compareStrings(String str1, String str2) {
	System.out.println("For strings <" + str1 + "> and <" + str2 + ">:");
	System.out.println("operator ==: " + (str1 == str2));
	System.out.println("operator !=: " + (str1 != str2));
	System.out.println("equals(): " + str1.equals(str2));
    }

}
