package ControllingExecution;
//A vampire number has an even number of digits and is formed by 
//multiplying a pair of numbers containing half the number of digits of the result. The digits 
//are taken from the original number in any order. Pairs of trailing zeroes are not allowed. 
//Examples include: 
//1260 = 21 * 60 
//1827 = 21 * 87 
//2187 = 27 * 81
/**
 * @author nazarko
 * 
 */
public class Ex_10 {
	static int a(int i) {
		return i/1000;
	}
	static int b(int i) {
		return (i%1000)/100;
	}
	static int c(int i) {
		return ((i%1000)%100)/10;
	}
	static int d(int i) {
		return ((i%1000)%100)%10;
	}
	static int com(int i, int j) {
		return (i * 10) + j;
	}
	static void test (int i, int m, int n) {
		if(m * n == i) System.out.println(i + " = " + m + " * " + n);
	}	
	
public static void main(String[] args) {	
	System.out.println("ControllingExecution / Ex_10");
	for(int i = 1001; i < 9999; i++) {			
		test(i, com(a(i), b(i)), com(c(i), d(i)));
		test(i, com(a(i), b(i)), com(d(i), c(i)));
		test(i, com(a(i), c(i)), com(b(i), d(i)));
		test(i, com(a(i), c(i)), com(d(i), b(i)));
		test(i, com(a(i), d(i)), com(b(i), c(i)));
		test(i, com(a(i), d(i)), com(c(i), b(i)));
		test(i, com(b(i), a(i)), com(c(i), d(i)));
		test(i, com(b(i), a(i)), com(d(i), c(i)));
		test(i, com(b(i), c(i)), com(d(i), a(i)));
		test(i, com(b(i), d(i)), com(c(i), a(i)));
		test(i, com(c(i), a(i)), com(d(i), b(i)));
		test(i, com(c(i), b(i)), com(d(i), a(i)));
	}			
} 
}