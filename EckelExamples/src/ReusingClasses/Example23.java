/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class First {
    static int j = printinit("First class -j");

    static int printinit(String s) {
	System.out.println(s);
	return 1;
    }
}

class Second extends First {
    static int k = printinit("Second class -k");

    public Second() {
	System.out.println("Second created");
    }
}

class Third {
    Third() {
	System.out.println("Third initialised");
    }
}

class Fourth{
    public Fourth() {
	System.out.println("Fourth init");
    }
}
public class Example23 extends Second {
public Example23() {
System.out.println("Example main constructor");
}
    /**
     * @param args
     */
    public static void main(String[] args) {
Example23 a= new Example23();
Fourth f= new Fourth();
    }

}
