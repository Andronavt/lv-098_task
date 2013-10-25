package eckel.innerclasses;

import eckel.innerclasses.six.SixBase;

public class Six extends SixBase {
    SixInner getInner() {
	return this.new SixInner();
    }

    public static void main(String[] args) {
	System.out.println(new Six().getInner().say());
    }

}
