/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 * 
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Tests13();

    }

}

class Tests13 {

    static Test13 obj1;
    static Test13 obj2;
    static {
	obj1 = new Test13();
	obj2 = new Test13();

    }
}

class Test13 {
    static int arg;
    static {
	arg = 10;
    }

    Test13() {
	System.out.println("Class Teat13 crated"+ ", arg is:"+arg);
	
    }
}