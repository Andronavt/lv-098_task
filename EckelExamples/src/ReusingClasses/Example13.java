/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class ClassOne {
    void show(int i) {
	System.out.println(i);
    }

    void show(double i) {
	System.out.println(i);
    }

    void show(char i) {
	System.out.println(i);
    }
}

class ClassTwo extends ClassOne {
    void show(String s) {
	System.out.println(s);
    }

}

public class Example13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ClassTwo t = new ClassTwo();
	t.show('a');
	t.show(1);
	t.show(1.4);
	t.show("sds");
    }

}
