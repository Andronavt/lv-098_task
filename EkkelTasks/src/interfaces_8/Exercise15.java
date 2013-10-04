/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 *
 */
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test152 obj = new Test152();
	Test152 obj2 = new Test152();
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
	obj.z();

    }

}

interface Itest151 {
    void a();

    void b();
}

interface Itest152 {
    void c();

    void d();
}

interface Itest153 {
    void e();

    void f();
}

interface Itest154 extends Itest151, Itest152, Itest153 {
    void g();
}

abstract class Test151 {
    void z(){
	System.out.println("Method from abstract class");
    }
}

class Test152 extends Test151 implements Itest154 {
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

    public void method1(Itest151 i) {
	System.out.println("Method1 take Itest141");
    }

    public void method2(Itest152 i) {
	System.out.println("Method1 take Itest142");
    }

    public void method3(Itest153 i) {
	System.out.println("Method1 take Itest143");
    }

    public void method4(Itest154 i) {
	System.out.println("Method1 take Itest144");
    }
}
