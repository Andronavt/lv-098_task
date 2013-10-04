/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test18 obj1 = new Test18(1);
	Test18 obj2 = new Test18(2);
	Test18 obj3 = new Test18(3);
	System.out.println("For obj1:"+ obj1.FIELD1 + " " + obj1.field2);
	System.out.println("For obj2:"+ obj2.FIELD1 + " " + obj2.field2);
	System.out.println("For obj3:"+ obj3.FIELD1 + " " + obj3.field2);
    }

}

class Test18 {
    final static int FIELD1 = 10;
    final int field2;

    Test18(int field2) {
	this.field2 = field2;
    }

}
