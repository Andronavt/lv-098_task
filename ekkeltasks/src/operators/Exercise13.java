/**
 * 
 */
package operators;

/**
 * @author Andrew
 * 
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Chars.charToBinary('h');
	Chars.charToBinary('a');
	Chars.charToBinary('b');
    }

}

class Chars {
    /**
     * @param a
     */
    public static void charToBinary(char a) {
	System.out.println(Integer.toBinaryString(a));
    }
}
