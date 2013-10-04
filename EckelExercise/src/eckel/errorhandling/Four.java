package eckel.errorhandling;

/*
 * ex 4
 */
class MyException extends Exception {
    private String msg;

    public String getMsg() {
	return msg;
    }

    MyException(String msg) {
	super(msg);
	System.out.println("MyException");
	this.msg = msg;
    }

}

public class Four {
    static void foo() throws MyException {
	throw new MyException("SPARTA! from foo()");
    }

    public static void main(String[] args) {
	try {
	    foo();
	} catch (MyException e) {
	    // e.getMessage();
	    e.printStackTrace();
	    System.out.println(e.getMsg());
	}

    }

}
