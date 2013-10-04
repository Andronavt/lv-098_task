/**
 * 
 */
package com.softserveinc.edu.lms.InitializtionCleanUp;

import com.softserveinc.edu.lms.everythingIsAnObject.Exercise10;

/**
 * @author Maryan
 * 
 */
public class Exrecise1011 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise10 ex = new Exercise10();
	while (true){
	new Exercise10();
	System.gc();
	new Exercise10();
	System.gc();
	new Exercise10();
	System.gc();
	new Exercise10();
	System.gc();
	new Exercise10();
	System.gc();
	new Exercise10();
	System.gc();
	System.runFinalization();
	}
    }

    @Override
    protected void finalize() throws Throwable {
	System.out.println("finalize method");
	super.finalize();
    }

}
