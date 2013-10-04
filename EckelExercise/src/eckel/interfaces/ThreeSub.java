package eckel.interfaces;

public class ThreeSub extends ThreeBase {
    private int value = 1;

    @Override
    public void print() {
	System.out.println(value);
    }

    public static void main(String[] args) {
	ThreeSub t = new ThreeSub();
	t.print();
    }
}
