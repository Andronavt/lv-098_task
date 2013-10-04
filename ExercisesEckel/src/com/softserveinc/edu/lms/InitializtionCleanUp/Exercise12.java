/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

/**
 * @author Maryan
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Tank tank = new Tank(true);
	tank.checkIsFull();
    }
}

class Tank {
    private boolean full;

    public Tank(boolean full) {
	this.full = full;
    }

    public void checkIsFull() {
	full = false;
    }

    protected void finalize() throws Throwable {
	if (full == true) {
	    System.out.println("finalize method run");
	    super.finalize();
	} else {
	    System.out.println("Tank is not full");
	}
    }
}
