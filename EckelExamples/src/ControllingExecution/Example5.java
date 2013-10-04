/**
 * 
 */
package ControllingExecution;

/**
 * @author Oleg
 *
 */
public class Example5 {

    static String test(int testval,int begin,int end)
    {
	if((testval>=begin)&&(testval<=end)) return "Including";
	else return "Out of range";
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(test(3, 1, 4));
	System.out.println(test(3, 4, 5));

    }

}
