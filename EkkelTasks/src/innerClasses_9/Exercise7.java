/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test7().secondOutMet();

    }

}

class Test7 {
    private int i;

    private void firstOutMet() {
	System.out.println("Call method Test7.firstOutMet()");
    }

    void secondOutMet() {
	System.out.println("Call method Test7.secondOutMet()");
	InTest7 obj = new InTest7();
	obj.changeOutField(5);
	System.out.println("private int i = " + i);
	obj.callOutMet();
    }

    class InTest7 {
	void changeOutField(int i) {
	    Test7.this.i = i;
	}

	void callOutMet() {
	    Test7.this.firstOutMet();
	}
    }
}
