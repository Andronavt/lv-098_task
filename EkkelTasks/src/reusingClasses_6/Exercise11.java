/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Detergent2.main(args);

    }

}

class Cleanser2 {
    public  String s = "Cleanser2";

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

}

class Detergent2 {
    private String s = "Detergent2";
    Cleanser2 obj = new Cleanser2();

    public void append(String a) {
	obj.append(a);
    }

    public void dilute() {
	obj.dilute();
    }

    public void apply() {
	obj.apply();
    }

    public void scrub() {
	obj.scrub();
    }

    public String toString() {
	return obj.toString();
    }

    public static void main(String[] args) {
	Detergent2 x = new Detergent2();
	x.dilute();
	x.apply();
	x.scrub();
	System.out.println(x);
    }
}