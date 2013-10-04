package eckel.everythingisanobject;

/*
 * Turn the DataOnly code fragment into a program that compiles and runs.
 */

/*
 * Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main().
 */
public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
	DataOnly dataOnly = new DataOnly();
	dataOnly.i = 47;
	dataOnly.d = 1.1;
	dataOnly.b = false;
	System.out.println("i: " + dataOnly.i);
	System.out.println("d: " + dataOnly.d);
	System.out.println("b: " + dataOnly.b);
    }

}
