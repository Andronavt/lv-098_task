/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 *
 */
public class Execption15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Tests15();

    }

}
class Test15{
    Test15(int i){
	System.out.println("Class Test15#"+i+" is created");
    }
}
class Tests15{
    Test15 obj1;
    Test15 obj2;
    {
	obj1 = new Test15(1);
	obj2 = new Test15(2);
    }
    Tests15(){
	System.out.println("Class Tests15 created!");
    }
}
