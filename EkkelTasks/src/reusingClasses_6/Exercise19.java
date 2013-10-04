/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test19 obj = new Test19(6);
	System.out.println("Field of Test19 is: " + obj.field);

    }

}

class Test19 {
    final int field;

    Test19(int field) {
	this.field = field;
    }
}