/**
 * 
 */
package everythingIsAnObject;

import java.util.*;

/**
 * @author orecto
 * 
 */
public class Exercise1 {
    public static void main(String[] args) {
	First f = new First();
	System.out.println("i " + f.i);
	System.out.println("c " + f.c);
    }
}

class First {
    public int i;
    public char c;
}
