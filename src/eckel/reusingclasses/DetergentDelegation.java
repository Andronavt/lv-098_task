package eckel.reusingclasses;

public class DetergentDelegation {
    private Cleanser cleanser = new Cleanser();

    // Delegated methods:

    public void dilute() {
	cleanser.dilute();
    }

    public void apply() {
	cleanser.apply();
    }

    public void scrub() {
	cleanser.scrub();
    }

    public void append(String s) {
	cleanser.append(s);
    }

    public static void main(String[] args) {
	DetergentDelegation detergentDelegation = new DetergentDelegation();
	detergentDelegation.dilute();
    }
}
