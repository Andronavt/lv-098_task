/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 *
 */
public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test17 obj = new Test17();
	System.out.println("X = "+obj.X);
	//obj.X = 2; Cannot assigned and should be accessed by static way
    }

}

interface Itest17{
    int X=1;
    int Y=2;
}
class Test17 implements Itest17{
    
}
