/**
 * 
 */
package initializationAndClining_4;

/**
 * @author Богдан
 * 
 */
public class Exercise2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	TestStr obj1 = new TestStr("by constructor");
	System.out.println("inicialisation by constructor: " + obj1.fieldByCon);
	System.out.println(" initialized at the point of definition: "
		+ obj1.fieldInP);

    }
}

class TestStr {
    String fieldInP = "in point";
    String fieldByCon;

    TestStr(String fieldByCon) {
	this.fieldByCon = fieldByCon;
    }
}
