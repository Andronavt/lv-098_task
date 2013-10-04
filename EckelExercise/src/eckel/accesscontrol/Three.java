package eckel.accesscontrol;

public class Three {

    public static void main(String[] args) {
	eckel.accesscontrol.debug.Three t = new eckel.accesscontrol.debug.Three();
	t.debug();
	eckel.accesscontrol.debugoff.Three tt = new eckel.accesscontrol.debugoff.Three();
	tt.debug();
	// tt.show(); //not visible
	Data data = new Data();
	data.show(10);
    }

}
