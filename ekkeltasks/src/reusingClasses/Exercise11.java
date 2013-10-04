/**
 * 
 */
package reusingClasses;

/**
 * @author Andrew
 * 
 */
class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
	s += a + " ";
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

class Detergent1 {
    private String s = "Detergent1";
    Cleanser obj = new Cleanser();

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

}

public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub\
	Detergent1 detergent = new Detergent1();
	detergent.apply();
	detergent.append("haha");
	detergent.dilute();
	System.out.println(detergent.toString());

    }

}
