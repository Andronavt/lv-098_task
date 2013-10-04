package eckel.innerclasses;

/*
 * ex 7
 */

public class Seven {
    private int i = 0;

    private void say() {
	System.out.println("This is SPARTA!!!");
    }

    class Inner {
	void changeOuter() {
	    i += 2;
	    say();
	}
    }

    public void showI() {
	System.out.println(i);
    }

    void testInner() {
	Inner i = new Inner();
	i.changeOuter();
    }

    public static void main(String[] args) {
	Seven s = new Seven();
	s.showI();
	s.testInner();
	s.showI();
    }

}
