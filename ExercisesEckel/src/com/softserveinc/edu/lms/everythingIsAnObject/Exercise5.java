/**
 * 
 */
package com.softserveinc.edu.lms.everythingIsAnObject;

/**
 * @author Maryan
 *
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	DataOnly2 data = new DataOnly2();
	data.i = 47;
	data.d = 1.1;
	data.b = false;
	System.out.println("DataOnly2 i = " + data.i);
	System.out.println("DataOnly2 d = " + data.d);
	System.out.println("DataOnly2 b = " + data.b);
	
    }

}

class DataOnly2 {
    int i;
    double d;
    boolean b;
}
