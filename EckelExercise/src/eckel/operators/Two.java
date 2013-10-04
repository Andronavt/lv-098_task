package eckel.operators;

/*
 * Create a class containing a float and use it to demonstrate aliasing.
 * Create a class containing a float and user it to demonstrate aliasing during method calls.
 */
public class Two {
    private float f;

    void setf(float f) {
	f = f;
    }

    static void setf(Two t) {
	t.f = 1.1f;
    }

    public static void main(String[] args) {
	Two two = new Two();
	two.f = 3.6F;
	setf(two);
	two.setf(2.2f);
    }

}
