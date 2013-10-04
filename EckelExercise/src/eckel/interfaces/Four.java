package eckel.interfaces;

public class Four extends FourBase {
    public void show() {
	System.out.println("Four.show()");
    }

    static void cast(FourBase f) {
	Four ff = (Four) f;
	ff.show();
    }

    public static void main(String[] args) {
	cast(new Four());
	new MainEckel().a();
	new MainEckel().b();
	new MainEckel().c();
    }
}
