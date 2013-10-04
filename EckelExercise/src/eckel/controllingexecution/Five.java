package eckel.controllingexecution;

public class Five {
    private static final int FIRST = 0x0110;
    private static final int SECOND = 0x0101;

    public static void main(String[] args) {
	System.out.println("ternary op: " + (FIRST < SECOND) != null ? 1 : 0);
	System.out.println("ternary op: " + (FIRST > SECOND) != null ? 1 : 0);
	
    }
}
