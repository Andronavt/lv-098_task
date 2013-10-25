package eckel.errorhandling;

/*
 * ex 19
 * repair the problem in LostMessage.java by guarding the call in the finally clause.
 */

public class Nineteen {
    public static void main(String[] args) {
	try {
	    LostMessage lostMessage = new LostMessage();
	    try {
		lostMessage.f();
	    } catch (Exception e) {
		System.out.println(e);
	    } finally {
		lostMessage.dispose();
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
