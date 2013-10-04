/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ForEx2 obj1 = new ForEx2();
	ForEx2 obj2 = new ForEx2();
	obj1.field = 5.0F;
	obj2.field = 10.0F;
	System.out.println("obj1.field = " + obj1.field + "; obj2.field = "
		+ obj2.field);
	obj1 = obj2;
	System.out.println("obj1.field = " + obj1.field + "; obj2.field = "
		+ obj2.field);
	obj1.field = 25.0F;
	System.out.println("obj1.field = " + obj1.field + "; obj2.field = "
		+ obj2.field);

    }

}

class ForEx2 {
    float field;
}