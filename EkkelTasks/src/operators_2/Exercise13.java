/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 *
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println("Character A has binarry form: "+ charToBinar('A'));
	System.out.println("Character B has binarry form: "+ charToBinar('B'));
	System.out.println("Character C has binarry form: "+ charToBinar('C'));
	System.out.println("Character D has binarry form: "+ charToBinar('D'));
    }
    static String charToBinar(char ch){
	return Integer.toBinaryString((int)ch);
    }

}
