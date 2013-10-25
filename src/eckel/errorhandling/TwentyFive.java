package eckel.errorhandling;

/*
 * ex 25
 * create a three-level heirarchy of exceptions.Now create a base-class A with a method that throws an exception at the base of your hierarchy. 
 * Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
 * Repeat by inheritin class C from B.In main(), create a C and upcast it to A, then call the method.
 */

class LvOne extends Exception {

}

class LvTwo extends LvOne {

}

class LvThree extends LvTwo {
}

class A25 {
    void foo() throws LvOne {
	throw new LvOne();
    }
}

class B25 extends A25 {
    void foo() throws LvTwo {
	throw new LvTwo();
    }
}

class C25 extends B25 {
    void foo() throws LvThree {
	throw new LvThree();
    }
}

public class TwentyFive {
    public static void main(String[] args) {
	A25 ac = new C25();
	try {
	    ac.foo();
	} catch (LvThree e3) {
	    System.out.println("lvthree exce");
	} catch (LvTwo e2) {
	    System.out.println("lvtwo exce");
	} catch (LvOne e1) {
	    System.out.println("lvone exce");
	}
    }
}
