/**
 * 
 */
package com.softsrveinc.edu.lms.reusingClasses;

/**
 * @author Maryan
 * 
 */

class Cleanser1 {
    private String s = "Cleanser1";

    public void append(String a) {
	s += a;
    }

    public void dilute() {
	append(" dilute()");
    }

    public void apply() {
	append(" apply()");
    }

    public void scrub() {
	append(" scrub()");
    }

    public String toString() {
	return s;
    }

    public static void main(String[] args) {
	Cleanser1 x = new Cleanser1();
	System.out.println(x);
    }
}

class DetergentDelegation {
	private String s = "DetergentDelegation";
	
	Cleanser1 c = new Cleanser1();
	public void append(String a) {
	    s += a; 
	}
	
	public void dilute() { 
		c.dilute(); 
	}
	
	public void apply() {
		c.apply(); 
		}
	
	public void scrub() {
		append(" DetergentDelegation.scrub()");
		c.scrub(); 
	}
	
	public void foam() { 
	    append(" foam()"); 
	    }
	
	public String toString() { 
	    return s + " " + c; 
	    }

}
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	DetergentDelegation detDelegation = new DetergentDelegation();
	
	detDelegation.dilute();
	detDelegation.apply();
	detDelegation.scrub();
	detDelegation.foam();
	
	System.out.println(detDelegation);
	System.out.println("Test Cleanser1");
	
	Cleanser1.main(args);
    }

}
