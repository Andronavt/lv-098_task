/**
 * 
 */
package com.softserveinc.edu.lms.accessControl;

/**
 * @author Maryan
 *
 */
public class Exercise6prot extends Exercise6 {

    /**
     * @param args
     */
    
    Exercise6 ex = new Exercise6();
    protected void useProtectedVariabele () {
	ex.variable =2;
    }
}
