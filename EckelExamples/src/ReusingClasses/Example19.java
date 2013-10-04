/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class BlankFinal {
    private int i;

    BlankFinal(int i) {
	System.out.println("Blank constructor");
	this.i = i;
    }
}

public class Example19 {
    private final BlankFinal b;

    public Example19() {
	b = new BlankFinal(1);
    }

    public Example19(int x) {
	b = new BlankFinal(x);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Example19 a = new Example19();
	Example19 b = new Example19(1);
	// a.b=new BlankFinal(1);
	// b.b=new BlankFinal(1);
	System.out.println(a.b);
	System.out.println(b.b);
    }

}
