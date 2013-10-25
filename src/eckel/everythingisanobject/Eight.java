package eckel.everythingisanobject;

/*
 * Write a program that demonstrates that, no matter how many object you create of a particular class,
 * there is only one instance of a particular static field in that class.
 */
public class Eight {
    Eight[] eight;
    static int i = 47;

    public Eight() {
	eight = new Eight[10];
    }

    public static void main(String[] args) {
	Eight e = new Eight();
	for (int i = 0; i < e.eight.length; i++) {
	    e.eight[i] = new Eight();
	    System.out.println(e.eight[i]);
	}
	for (int i = 0; i < e.eight.length; i++) {
	    System.out.println(e.eight[i].i);
	}
    }
}
