/**
 * 
 */
package Operators;

/**
 * @author Oleg
 *
 */
public class Example13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	char c= 'a';
	System.out.println(Integer.toBinaryString(c));
	c='j';
	System.out.println(Integer.toBinaryString(c));
	c+=1;
	System.out.println(Integer.toBinaryString(c));
	c+=10;
	System.out.println(Integer.toBinaryString(c));
	c='Z';
	System.out.println(Integer.toBinaryString(c));

    }

}
