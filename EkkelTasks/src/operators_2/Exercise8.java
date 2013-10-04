/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {
    static long hexArg;
    static long octArg;
  

    /**
     * @param args
     */
    public static void main(String[] args) {
	hexArg = 0x1A5;
	octArg = 0137;
	System.out.println("long with hex is: "+ Long.toBinaryString(hexArg));
	System.out.println("long with octal is: "+Long.toBinaryString(octArg));
    }

}
