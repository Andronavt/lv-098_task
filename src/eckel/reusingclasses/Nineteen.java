package eckel.reusingclasses;

public class Nineteen {
    private final One one;
    private final Eighteen eighteen;

    public Nineteen() {
	one = new One();
	eighteen = new Eighteen();
    }

    public static void main(String[] args) {
	Nineteen nineteen = new Nineteen();
	if ((nineteen.one == null) || (nineteen.eighteen == null)) {
	    System.out.println("сумно");
	}
	// nineteen.one = new One(); немона!!
    }

}
