/**
 * 
 */
package controllingExecution;

/**
 * @author Andrew
 * 
 */
class Fibonacci {
    public static void quantityFibonacci(int n) {
	int a = 1;
	int b = 0;
	for (int i = 0; i < n; i++) {
	    b = a + b;
	    a = b - a;
	    System.out.println(b);
	}
    }
}

public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Fibonacci.quantityFibonacci(10);
    }

}
