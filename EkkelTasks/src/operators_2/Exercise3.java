/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 *
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ForEx3 obj1 = new ForEx3();
	ForEx3 obj2 = new ForEx3();
	obj1 = obj2;
	obj1.field = 10.5F;
	System.out.println("obj1.field = " + obj1.field + "; obj2.field = "
		+ obj2.field);
	f(obj1);
	System.out.println("obj1.field = " + obj1.field + "; obj2.field = "
		+ obj2.field);
    }
    
    public static void  f(ForEx3 a){
	a.field = 5.5F;
    }

}
class ForEx3 {
    float field;
}