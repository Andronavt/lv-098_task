package eckel.errorhandling;

/*
 * ex 13
 * modify ex 9 by adding a finally clause.Verify that your finally clause is executed, even if a NullPointerException is thrown
 */

public class Thirteen {
    private static Integer[] arr = new Integer[1];

    public static void main(String[] args) {
	try {
	    Nine.foo(arr[0]);
	    Nine.foo(0);
	    Nine.foo(1);
	    Nine.foo(-1);
	} catch (Exception e) {
	    e.printStackTrace(System.out);
	}finally{
	    System.out.println("wiiiii finally!!!");
	}
    }
}
