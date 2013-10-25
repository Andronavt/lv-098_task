package eckel.polymorphism;

public class TenSub extends TenSuper {
    @Override
    protected void b() {

	super.b();
    }

    public static void upcast(TenSuper s) {
	s.a();
    }

    public static void main(String[] args) {
	TenSub t = new TenSub();
	// t = (TenSub) ts;
	// t.a();
	upcast(t);
    }
}
