package eckel.strings;

import java.util.ArrayList;
import java.util.List;

/*
 * ex 2
 * repair InfiniteRecursion.java
 */
class InfiniteRecursion {
    public String toString() {
	return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
	List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
	for (int i = 0; i < 10; i++)
	    v.add(new InfiniteRecursion());
	System.out.println(v);
    }
} // /:~

public class Two {
    public static void main(String[] args) {
	System.out.println("Boo");
    }

}
