/**
 * 
 */
package innerClasses_9.exercise6.pack2;

import innerClasses_9.exercise6.pack1.Itest6;

/**
 * @author Богдан
 * 
 */
public class Test6 {
    protected class InTest6 implements Itest6 {
	InTest6(){
	    System.out.println("InTest6");
	}
	@Override
	public void f() {
	    System.out.println("Method f() from InTest6");

	}
    }
    protected InTest6 inner(){
	return new InTest6();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
