package eckel.errorhandling;

/*
 * ex 18
 * Add a second level of exception loss to LostMessage.java so that the HoHumException is itlself replaced by a third excpetion.
 */
class VeryImportantException extends Exception {
    public String toString() {
	return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
	return "A trivial exception";
    }
}

class TException extends Exception {
    public String toString() {
	return "A TException exception";
    }
}

class LostMessage {
    void f() throws VeryImportantException {
	throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
	throw new HoHumException();
    }

    void e() throws TException {
	throw new TException();
    }
}

public class Eighteen {
    public static void main(String[] args) {
	try {
	    LostMessage lostMessage = new LostMessage();
	    try {
		try {
		    lostMessage.f();
		    lostMessage.dispose();
		} finally {
		    lostMessage.e();
		}
	    } catch (Exception e) {
		System.out.println(e);
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
