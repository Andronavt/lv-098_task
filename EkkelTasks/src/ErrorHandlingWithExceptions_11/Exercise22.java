/**
 * Exercise 22:   (2) Create a class called FailingConstructor with a constructor that 
 * might fail partway through the construction process and throw an exception. In main( ),
 * write code that properly guards against this failure. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 *
 */
public class Exercise22 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try{
	    new Test21();
	}catch (Exception e){
	    System.out.println("Catch Exception");
	}finally{
	    System.out.println("Program works");
	}

    }

}
class Test21{
    Test21() throws Exception{
	throw new Exception();
    }
}
