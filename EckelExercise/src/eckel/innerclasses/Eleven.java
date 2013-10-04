package eckel.innerclasses;

/*
 * ex 11
 */
public class Eleven {
    private class Inner implements INine {
	@Override
	public void say(String s) {
	    System.out.println(s);
	}
    }

    INine returnI() {
	return new Inner();
    }

    public static void main(String[] args) {
	Eleven e = new Eleven();
	e.returnI().say("Thsi is SPARTA!!!");

	// ((Inner)t.returnI()).say("Alah akbar!!");
    }

}
