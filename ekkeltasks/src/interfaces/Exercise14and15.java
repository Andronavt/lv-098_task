/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 * 
 */
interface First {
    void a();

    void b();
}

interface Second {
    void c();

    void d();
}

interface Third {
    void e();

    void f();
}

interface Fourth extends First, Second, Third {
    void g();

}

abstract class Concrete {
 abstract void tr();
}

class First1 extends Concrete implements Fourth {

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

    @Override
    public void f() {
	// TODO Auto-generated method stub

    }

    @Override
    public void d() {
	// TODO Auto-generated method stub
    }

    @Override
    public void e() {

    }

    @Override
    public void g() {

    }
    @Override
    public void tr()
    {
	
    }

}

public class Exercise14and15 {

    /**
     * @param args
     */
        public static void m1(First first) { first.a(); }
	public static void m2(Second second) { second.c();; }
	public static void m3(Third third) { third.e(); } 
	public static void m4(Fourth fourth) { fourth.f(); }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	First1 first1 = new First1();
	m1(first1);
	m2(first1);
	m3(first1);
	m4(first1);

    }

}
