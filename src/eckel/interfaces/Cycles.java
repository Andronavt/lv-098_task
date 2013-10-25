package eckel.interfaces;

/*
 * Ex 18
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
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Unicycle();
    }
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
	System.out.println("NineB.ride()");
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Bicycle();
    }
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
	System.out.println("T.ride()");
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Tricycle();
    }
}

public class Cycles {

    public static void rideCyc(CycleFactory cycleFactory) {
	Cycle c = cycleFactory.getCycle();
	c.ride();
    }

    public static void main(String[] args) {
	rideCyc(new UnicycleFactory());
	rideCyc(new TricycleFactory());
	rideCyc(new BicycleFactory());
    }

}
