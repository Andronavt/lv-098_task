/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 *
 */
public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	//method2(new Test4());//Cannot instantiate

    }
    static void method2(Test4 t){
	Test42 tt = (Test42)t;
	tt.method();
    }

}
abstract class Test4{
    abstract void method();
    
}
class Test42 extends Test4{
    void method(){
	System.out.println("Method from Test42");
    }
}
