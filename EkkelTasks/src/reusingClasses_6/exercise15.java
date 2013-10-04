/**
 * 
 */
package reusingClasses_6;

import reusingClasses_6.packForReusingClasses.ClassForEx15;

/**
 * @author Богдан
 * 
 */
public class exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ClassForEx15 obj = new ClassForEx15();
	// obj.method(); //Not visible here
	Test15 obj2 = new Test15();
	obj2.method();
    }

}

class Test15 extends ClassForEx15 {
   
}
