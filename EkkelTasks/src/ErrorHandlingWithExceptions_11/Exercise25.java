/**
 * Exercise 25:   (2) Create a three-level hierarchy of exceptions. Now create a base-class A
 * with a method that throws an exception at the base of your hierarchy. Inherit B from A and
 * override the method so it throws an exception at level two of your hierarchy. Repeat by 
 * inheriting class C from B. In main( ), create a C and upcast it to A, then call the method. 
 */
package ErrorHandlingWithExceptions_11;

/**
 * @author Богдан
 * 
 */
public class Exercise25 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	A c = new C();
	try {
	    c.callEx();
	} catch (LeveleOneEx e) {
	    System.out.println(">>>>Exception :" + e);
	}

    }

}

class LeveleOneEx extends Exception {
}

class LevelTwoEx extends LeveleOneEx {
}

class LevelThreeEx extends LevelTwoEx {
}

class A {
    void callEx() throws LeveleOneEx {
	throw new LeveleOneEx();
    }
}

class B extends A {
    void callEx() throws LevelTwoEx {
	throw new LevelTwoEx();
    }
}

class C extends B {
    void callEx() throws LevelThreeEx {
	throw new LevelThreeEx();
    }
}