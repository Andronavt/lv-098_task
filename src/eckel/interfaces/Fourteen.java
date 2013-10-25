package eckel.interfaces;

/*
 * Ex 14-15
 */
interface Af {
    void af();

    void sf();
}

interface Bf {
    void bf();

    void nf();
}

interface Cf {
    void cf();

    void vf();
}

interface Df extends Af, Bf, Cf {
    void zz();
}

// class Teen {
// public void teen() {
// }
// }
abstract class Teen {
    abstract void teen();
}

class Young extends Teen implements Df {

    @Override
    public void af() {
	// TODO Auto-generated method stub

    }

    @Override
    public void sf() {
	// TODO Auto-generated method stub

    }

    @Override
    public void bf() {
	// TODO Auto-generated method stub

    }

    @Override
    public void nf() {
	// TODO Auto-generated method stub

    }

    @Override
    public void cf() {
	// TODO Auto-generated method stub

    }

    @Override
    public void vf() {
	// TODO Auto-generated method stub

    }

    @Override
    public void zz() {
	// TODO Auto-generated method stub

    }

    @Override
    void teen() {
	// TODO Auto-generated method stub

    }

}

public class Fourteen {
    public static void f1(Af a) {
	a.af();
    }

    public static void f2(Bf b) {
	b.bf();
    }

    public static void f3(Cf c) {
	c.cf();
    }

    public static void f4(Df d) {
	d.zz();
    }

    public static void main(String[] args) {
	Young y = new Young();
	f1(y);
	f2(y);
	f3(y);
	f4(y);
    }

}
