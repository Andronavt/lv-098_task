package eckel.initializationandcleanup;

public class Fourteen {
    static String line = "line";
    static String scopeLine;
    static {
	scopeLine = "scope line";
    }

    static void showLines() {
	System.out.println("line : " + line + " scopeLine : " + scopeLine);
    }

    public static void main(String[] args) {
	showLines();
    }

}
