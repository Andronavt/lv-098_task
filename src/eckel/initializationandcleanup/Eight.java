package eckel.initializationandcleanup;

public class Eight {
    private void a() {
	System.out.println("method a()");
    }

    private void b() {
	a();
	this.a();// bad
	System.out.println("method b()");
    }

    public static void main(String[] args) {
	new Eight().a();
	new Eight().b();
    }

}
