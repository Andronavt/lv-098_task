/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test142 obj = new Test142();
	Test142 obj2 = new Test142();
	obj.a();
	obj.b();
	obj.c();
	obj.d();
	obj.e();
	obj.f();
	obj.g();
	obj.method1(obj2);
	obj.method2(obj2);
	obj.method3(obj2);
	obj.method4(obj2);

    }

}

interface Itest141 {
    void a();

    void b();
}

interface Itest142 {
    void c();

    void d();
}

interface Itest143 {
    void e();

    void f();
}

interface Itest144 extends Itest141, Itest142, Itest143 {
    void g();
}

class Test141 {
}

class Test142 extends Exercise14 implements Itest144 {
    @Override
    public void a() {
	System.out.println("Method a()");
    }

    @Override
    public void b() {
	System.out.println("Method b()");
    }

    @Override
    public void c() {
	System.out.println("Method c()");
    }

    @Override
    public void d() {
	System.out.println("Method d()");
    }

    @Override
    public void e() {
	System.out.println("Method e()");
    }

    @Override
    public void f() {
	System.out.println("Method f()");
    }

    @Override
    public void g() {
	System.out.println("Method g()");
    }

    public void method1(Itest141 i) {
	System.out.println("Method1 take Itest141");
    }

    public void method2(Itest142 i) {
	System.out.println("Method1 take Itest142");
    }

    public void method3(Itest143 i) {
	System.out.println("Method1 take Itest143");
    }

    public void method4(Itest144 i) {
	System.out.println("Method1 take Itest144");
    }
}
