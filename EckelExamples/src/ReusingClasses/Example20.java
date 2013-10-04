/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class WithFinals {
    private final void f() {
	System.out.println("WithFinals.f()");
    }

    private void g() {
	System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    
    private final void f() {
	System.out.println("OverridingPrivate.f()");
    }

    private void g() {
	System.out.println("OverridingPrivate.g()");
    }
    // @Override private final void f() { }
    // @Override private void g() {  }
}

class OverridingPrivate2 extends OverridingPrivate {
   
    public final void f() {
	System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
	System.out.println("OverridingPrivate2.g()");
    }
   
    // @Override public final void f() {  }
    // @Override public void g() {  }
}

public class Example20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	OverridingPrivate2 op2 = new OverridingPrivate2();
	op2.f();
	op2.g();
	OverridingPrivate p = op2;
	
	// op.f(); 
	// op.f();
	WithFinals wf = op2;
	// wf.f(); 
	// wf.g();
    }

}
