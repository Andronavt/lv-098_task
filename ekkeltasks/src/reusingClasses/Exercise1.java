/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	new Test11();

    }

}

class Test1 {

}

class Test11 {
    Test1 a;

    Test11() {
	a = new Test1();
    }

}
