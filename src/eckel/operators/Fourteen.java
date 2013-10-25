package eckel.operators;

/*
 * Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Stings
 * and print the results.Fot the == and !=, also perform the equals() test.In main(),call your method with some 
 * different String object.
 */

public class Fourteen {

    public static void compareString(String a, String b) {
	System.out.println("----------------");
	System.out.println(" == : " + (a == b));
	System.out.println(" != : " + (a != b));
	System.out.println(" equals() : " + (a.equals(b)));
	System.out.println("----------------");
    }

    public static void main(String[] args) {
	String a = "a";
	String b = "b";
	String aa = new String("aa");
	String bb = new String("bb");
	compareString(a, b);
	compareString(aa, bb);
	compareString(a, a);
	compareString(aa, aa);
    }
}
