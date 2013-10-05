package eckel.errorhandling;

/*
 * modify exercise 4 so that the custom exception class inherits from RuntimeException, and show that the compiler allows you to leave
 * out the try block;
 */

class Ex28 extends RuntimeException {
    private String msg;

    Ex28(String msg) {
	super(msg);
	System.out.println("Constructor from Ex28");
	this.msg = msg;
    }

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }
}

public class TwentyEight {
    public static void foo() throws Ex28 {
	System.out.println("from fooo()");
	throw new Ex28("FOO");
    }

    public static void main(String[] args) {
	foo();
    }

}
