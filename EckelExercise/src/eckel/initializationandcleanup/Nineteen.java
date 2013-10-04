package eckel.initializationandcleanup;

public class Nineteen {
    public static void takeVarargString(String... args) {
	for (String s : args) {
	    System.out.println(s);
	}
    }

    public static void main(String[] args) {
	String[] arr = { "NineA", "NineB", "NineC", "D" };
	takeVarargString("a", "b", "c");
	takeVarargString(arr);
    }
}
