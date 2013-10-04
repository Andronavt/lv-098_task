/**
 * 
 */
package innerClasses.Exercise6main;

import innerClasses.A1;
import innerClasses.exercise6.Exercise6;

/**
 * @author Andrew
 * 
 */
public class Exercise6main extends Exercise6 {

    A1 getInnerC() {
	return this.new C();
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise6main k = new Exercise6main();
	k.getInnerC().print();

    }

}
