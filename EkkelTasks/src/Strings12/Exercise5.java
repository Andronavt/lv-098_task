/**
 * Exercise 5:   (5) For each of the basic conversion types in the above table, write the most 
 * complex formatting expression possible. That is, use all the possible format specifiers 
 * available for that conversion type.  
 */
package Strings12;

import java.math.BigInteger;
import java.util.Formatter;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Formatter f = new Formatter(System.out);

	int i = 50;
	System.out.println("int i = 50");
	f.format("%-3s%-3S%-3d%-3c%-3C%-5b%-5B%-4x%-4X%-4h%-4H%%\n", i, i, i,
		i, i, i, i, i, i, i, i);

	double d = 50.65;
	System.out.println("double d = 50.65");
	f.format("%-6s%-6S%-5b%-5B%-15f%-15e%-15E%-12h%-12H%%\n", d, d, d, d,
		d, d, d, d, d);

	boolean b = true;
	System.out.println("boolean b = false");
	f.format("%-5s%-5S%-5b%-5B%-5h%-5H%%\n", b, b, b, b, b, b);

	char ch = 'A';
	System.out.println("char u = A");
	f.format("%-2s%-2S%-2c%-2C%-5b%-5B%-3h%-3H%%\n", ch, ch, ch, ch, ch,
		ch, ch, ch);

    }

}
