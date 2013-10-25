package eckel.innerclasses;

/*
 * Ex 16
 */

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
	System.out.println("U.ride()");
    }

    public static CycleFactory fact = new CycleFactory() {

	@Override
	public Cycle getCycle() {
	    // TODO Auto-generated method stub
	    return new Unicycle();
	}
    };
}

// class UnicycleFactory implements CycleFactory {
// @Override
// public Cycle getCycle() {
// return new Unicycle();
// }
// }

class Bicycle implements Cycle {
    @Override
    public void ride() {
	System.out.println("NineB.ride()");
    }

    public static CycleFactory fact = new CycleFactory() {

	@Override
	public Cycle getCycle() {
	    // TODO Auto-generated method stub
	    return new Bicycle();
	}
    };
}

// class BicycleFactory implements CycleFactory {
// @Override
// public Cycle getCycle() {
// return new Bicycle();
// }
// }

class Tricycle implements Cycle {
    @Override
    public void ride() {
	System.out.println("T.ride()");
    }

    public static CycleFactory fact = new CycleFactory() {

	@Override
	public Cycle getCycle() {
	    // TODO Auto-generated method stub
	    return new Tricycle();
	}
    };
}

// class TricycleFactory implements CycleFactory {
// @Override
// public Cycle getCycle() {
// return new Tricycle();
// }
// }

public class Cycles {

    public static void rideCyc(CycleFactory cycleFactory) {
	Cycle c = cycleFactory.getCycle();
	c.ride();
    }

    public static void main(String[] args) {
	rideCyc(Unicycle.fact);
	rideCyc(Tricycle.fact);
	rideCyc(Bicycle.fact);
    }

}
