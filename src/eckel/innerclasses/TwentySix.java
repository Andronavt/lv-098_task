package eckel.innerclasses;

import eckel.innerclasses.OuterB.InnerB;

class OuterA {
    class InnerA {
	public InnerA(String s) {
	    System.out.println("InnerA()" + s);
	}
    }
}

class OuterB {
    class InnerB extends OuterA.InnerA {
	public InnerB(OuterA oa) {
	    oa.super("This is SPARTA!!");
	    System.out.println("OuterB.InnerB()");
	}
    }
}

public class TwentySix {
    public static void main(String[] args) {
	OuterA oa = new OuterA();
	OuterB ob = new OuterB();
	InnerB i = ob.new InnerB(oa);
    }
}
