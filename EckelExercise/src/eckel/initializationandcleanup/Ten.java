package eckel.initializationandcleanup;

public class Ten {

    protected void finalize() {
	System.out.println("finalize()");
    }

    public static void main(String[] args) {
	new Ten();
	System.gc();
	System.runFinalization();
    }
}
