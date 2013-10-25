package eckel.initializationandcleanup;

public class Nine {
    private int k;

    public Nine() {
	this(1);
	System.out.println("Default");
    }

    public Nine(int k) {
	this.k = k;
	System.out.println("Param");
    }

    public static void main(String[] args) {
	Nine n = new Nine();
    }
}
