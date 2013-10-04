package eckel.initializationandcleanup;

public class Two {
    private String lineF = "point of definition";
    private String lineS;

    public Two(String line) {
	lineS = line;
    }

    /*
     * різницю можу пояснити
     */

    public static void main(String[] args) {
	// System.out.println(t.lineF); воу воу полегше вона ше
	// не ініціалізувалась :)
	Two t = new Two("OMG");
	System.out.println(t.lineS);
	System.out.println(t.lineF);
    }

}
