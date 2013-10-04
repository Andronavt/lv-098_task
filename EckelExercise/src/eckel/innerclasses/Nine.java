package eckel.innerclasses;

/*
 *  ex 9 - 10
 */

public class Nine {
    INine a() {
	if (true) {
	    class Inner implements INine {
		@Override
		public void say(String s) {
		    System.out.println(s);
		}
	    }
	    return new Inner();
	}
	return null;
    }

    public static void main(String[] args) {
	new Nine().a().say("This is SPARTA!!!");
    }
}
