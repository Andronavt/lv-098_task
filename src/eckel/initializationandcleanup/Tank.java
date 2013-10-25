package eckel.initializationandcleanup;

public class Tank {
    private boolean fillOut = false;

    public Tank(boolean fillOut) {
	this.fillOut = fillOut;
    }

    void fillIn() {
	fillOut = false;
    }

    protected void finalize() {
	if (fillOut)
	    System.out.println("Error: ta da da da!");
    }

    public static void main(String[] args) {
	Tank t = new Tank(true);
	t.fillIn();
	new Tank(true);
	System.gc();
    }
}
