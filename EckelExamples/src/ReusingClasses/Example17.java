/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 *
 */
class Amphibian1 {
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

class Frog1 extends Amphibian1 {
void a(){
    System.out.println("b");
}
void b(){
    System.out.println("b");
}
}

public class Example17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Frog1 f = new Frog1();
	f.a();
	f.b();
	f.c();
	Amphibian1 a = new Amphibian1();
	a = f;
	a.a();
	a.b();
	a.c();
    }

}
