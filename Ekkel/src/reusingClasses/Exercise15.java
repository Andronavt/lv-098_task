/**
 * 
 */
package reusingClasses;

import controllingExecution.Exercise1;

/**
 * @author orecto
 * 
 */
public class Exercise15  extends controllingExecution.Exercise1 {
	public static void main(String[] args) {
		// calling protected method
		Exercise1 p = new Exercise1();
		//p.protectedShow();

		Exercise15 pd = new Exercise15();
		pd.protectedShow();
	}
}
/*
 * Create a class inside a package. Your class should contain a protected
 * method. Outside of the package, try to call the protected method and explain
 * the results. Now inherit from your class and call the protected method from
 * inside a method of your derived class
 */