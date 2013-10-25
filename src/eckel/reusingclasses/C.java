package eckel.reusingclasses;

public class C extends A {
    public C(String s) {
	super(s);
	B b = new B(s);
	System.out.println("NineC");
	System.out.println(s);
    }

    public static void main(String[] args) {
	new C("good");
    }
}
