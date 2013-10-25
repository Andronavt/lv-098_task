package eckel.innerclasses;

import eckel.innerclasses.Seven.Inner;

interface Inner12 {
    void changeOuter();
}

public class Twelve {
    private int i = 0;

    public Inner12 inner() {
	return new Inner12() {
	    @Override
	    public void changeOuter() {
		i += 2;
		say();
	    }
	};
    }

    private void say() {
	System.out.println("This is SPARTA!!!");
    }

    public void showI() {
	System.out.println(i);
    }

    public static void main(String[] args) {
	Twelve t = new Twelve();
	t.showI();
	t.inner().changeOuter();
	t.showI();
    }

}
