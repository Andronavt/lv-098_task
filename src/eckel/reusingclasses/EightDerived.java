package eckel.reusingclasses;

public class EightDerived extends EightNonDefault {
    public EightDerived() {
	super("s");
    }

    public EightDerived(String s) {
	super(s);
	System.out.println("EightDerived: " + s);
    }

}
