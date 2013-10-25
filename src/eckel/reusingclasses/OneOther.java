package eckel.reusingclasses;

public class OneOther {
    private One one;

    public One getOne() {
	if (one == null) {
	    one = new One();
	}
	return one;
    }
}
