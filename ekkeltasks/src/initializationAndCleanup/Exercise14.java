/**
 * 
 */
package initializationAndCleanup;

/**
 * @author Andrew
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stri.print();
    }

}

class Stri {
    String c;
    static String a = "haha";
    static String b;
    static {
	b = "static";
    }

    Stri(String c) {
	this.c = c;
    }

    public static void print() {
	System.out.println(a);
	System.out.println(b);
    }

}