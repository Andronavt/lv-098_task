package EverythingIsAnObject;

public class Example6 {
    int storage(String s) {
	return s.length() * 2;
    }

    public static void main(String[] args) {
	Example6 ex6 = new Example6();
	System.out.println(ex6.storage("Oleg"));
    }
}
