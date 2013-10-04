package eckel.controllingexecution;

public class Fibonacci {
    public static long fib(int n) {
	return (n <= 1) ? n : fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
	int number = Integer.valueOf(args[0]);
	for (int i = 1; i <= number; i++) {
	    System.out.println(i + ": " + fib(i));
	}
    }

}
