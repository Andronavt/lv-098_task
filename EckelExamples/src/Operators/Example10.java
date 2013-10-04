/**
 * 
 */
package Operators;

/**
 * @author Oleg
 * 
 */
public class Example10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int el1 = 0x10010;
	int el2 = 0x10101;
	System.out.println(Integer.toBinaryString(el1));
	System.out.println(Integer.toBinaryString(el2));
	System.out.println("================================");
	System.out.println(Integer.toBinaryString(el1 & el2));
	System.out.println(Integer.toBinaryString(el1 | el2));
	System.out.println(Integer.toBinaryString(el1 ^ el2));
	System.out.println(Integer.toBinaryString(~el1));
	System.out.println(Integer.toBinaryString(~el2));
	
	
    }

}
