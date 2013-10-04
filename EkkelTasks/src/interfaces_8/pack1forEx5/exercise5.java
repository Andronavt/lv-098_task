/**
 * 
 */
package interfaces_8.pack1forEx5;
import interfaces_8.Pack0forEx5.*;

/**
 * @author Богдан
 *
 */
public class exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test5 t = new Test5();
	t.first();
	t.second();
	t.third();

    }

}
class Test5 implements InterInterface{
    @Override
    public void first() {
        System.out.println("1");
        
    }
    @Override
    public void second() {
	System.out.println("2");
        
    }
    @Override
    public void third() {
	System.out.println("3");
        
    }
    
}
