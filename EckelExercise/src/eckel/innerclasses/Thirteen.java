package eckel.innerclasses;

interface Inner13 {
    void say(String s);
}

public class Thirteen {
    Inner13 inner13() {
	return new Inner13() {
	    @Override
	    public void say(String s) {
		System.out.println(s);
	    }
	};
    }

    public static void main(String[] args) {
	Thirteen t = new Thirteen();
	t.inner13().say("This is SPARTA!!!~");
    }

}
