/**
 * 
 */
package innerClasses_9.exercise6.pack3;

import innerClasses_9.exercise6.pack1.Itest6;
import innerClasses_9.exercise6.pack2.Test6;

/**
 * @author Богдан
 *
 */
public class Test6_2 extends Test6 {
    Itest6 method(){
	
	return (Itest6)inner();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test6_2().method();

    }

}
