/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class Amphibian {
    void a() {
	System.out.println("a");
    }

    void b() {
	System.out.println("a");
    }

    void c() {
	System.out.println("a");
    }
}

class Frog extends Amphibian {

}

public class Example15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Frog f = new Frog();
	f.a();
	f.b();
	f.c();
	Amphibian a = new Amphibian();
	a = f;
	a.a();
	a.b();
	a.c();

    }

}
