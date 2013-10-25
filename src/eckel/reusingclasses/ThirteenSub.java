package eckel.reusingclasses;

public class ThirteenSub extends ThirteenSuper {
    @Override
    protected void show() {
	// TODO Auto-generated method stub
	super.show();
    }

    @Override
    protected void show(int k) {
	// TODO Auto-generated method stub
	super.show(k);
    }

    @Override
    protected void show(String s) {
	// TODO Auto-generated method stub
	super.show(s);
    }

    protected void show(long l) {

    }

    public static void main(String[] args) {
	ThirteenSub t = new ThirteenSub();
	t.show();
	t.show(1);
	t.show(1L);
	t.show("ll");
    }
}
