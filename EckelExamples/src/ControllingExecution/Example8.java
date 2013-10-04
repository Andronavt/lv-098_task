/**
 * 
 */
package ControllingExecution;

/**
 * @author Oleg
 * 
 */
public class Example8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int i = 0; i < 6; i++) {

	    switch (i) {
	    case 0:
		System.out.println("zero");
		break;
	    case 1:
		System.out.println("one");
		break;
	    case 2:
		System.out.println("two");
		break;
	    case 3:
		System.out.println("three");
		break;
	    case 4:
		System.out.println("four");
		break;
	    case 5:
		System.out.println("five");
		break;
	    default:
		System.out.println("default");
	    }
	}

    }

}
