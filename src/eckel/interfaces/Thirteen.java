package eckel.interfaces;

/*
 * Ex 13
 */
interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C extends A, B {
    void c();
}

class Z implements C {

    @Override
    public void a() {
	// TODO Auto-generated method stub

    }

    @Override
    public void b() {
	// TODO Auto-generated method stub

    }

    @Override
    public void c() {
	// TODO Auto-generated method stub

    }

}

public class Thirteen {
    public static void main(String[] args) {
	Z z = new Z();
	z.a();
	z.b();
	z.c();
    }
}
