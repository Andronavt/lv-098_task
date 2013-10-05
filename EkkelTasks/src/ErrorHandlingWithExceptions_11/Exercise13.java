/**
 * Exercise 13:   (2) Modify Exercise 9 by adding a finally clause. Verify that your finally 
 * clause is executed, even if a NullPointerException is thrown. 
 */
package ErrorHandlingWithExceptions_11;

import java.util.Random;

/**
 * @author Богдан
 *
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    //throeEx();
	    throw new NullPointerException();
	} catch (Exception e) {
	    e.printStackTrace();
	}finally{
	    System.out.println("Finally execute always");
	}

    }

    public static void throeEx() throws Exercise9Ex_1, Exercise9Ex_2,
	    Exercise9Ex_3 {
	Random rand = new Random();
	switch (rand.nextInt(2)) {
	case 0:
	    throw new Exercise9Ex_1("Message Exercise9Ex_1");

	case 1:
	    throw new Exercise9Ex_2("Message  Exercise9Ex_2");

	case 2:
	    throw new Exercise9Ex_3("Message  Exercise9Ex_3");

	}
    }

}
