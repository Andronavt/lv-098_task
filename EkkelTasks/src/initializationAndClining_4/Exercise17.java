/**
 * 
 */
package initializationAndClining_4;

import java.util.Arrays;

/**
 * @author Богдан
 * 
 */
public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test17[] array = new Test17[5];
	System.out.println(Arrays.toString(array));
}
}

class Test17 {
    
    Test17(String s) {
	System.out.println(s);
    }
    public String toString(){
	return "Class Test17";
    }
}