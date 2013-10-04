/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test14.printsFields();

    }

}
class Test14{
    static String field1 = "first";
    static String field2;
    static{
	field2 = "second";
    }
    static void printsFields(){
	System.out.println("First field is:" + field1+ "; second field is:"+ field2);
    }
}
