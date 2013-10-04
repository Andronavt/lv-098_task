package eckel.reusingclasses;

public class Two extends Detergent {
    @Override
    public void scrub() {
	append(" Two.scrub()");
	super.scrub();
    }

    public void sterilize() {
	append(" Two.sterilize()");
    }

}
