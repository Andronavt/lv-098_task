/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class MyA {
    MyA() {
	System.out.println("MyA");
    }
}

class MyB {
    MyB() {
	System.out.println("MyB");
    }
}

class MyC extends MyA {
    MyB b = new MyB();
}

public class Example5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	MyC c = new MyC();
    }

}
