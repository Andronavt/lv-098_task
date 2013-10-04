/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Cartoon();
    }

}

class Art {
    Art() {
	System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
	System.out.println("Drawing constructor");
    }
}

class Cartoon extends Drawing {}