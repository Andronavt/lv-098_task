package eckel.errorhandling;

/*
 * ex 8N
 */

class N {
    static void f() throws MyException {
	throw new MyException("SPARTA");
    }
}

public class Eight {

    public static void main(String[] args) {
	try{	  
	    N.f();
	}catch(MyException e){
	    e.printStackTrace();
	    e.getMsg();
	}
    }
}
