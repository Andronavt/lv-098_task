/**
 * 
 */
package innerClasses;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride() {
	System.out.println("Unicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {
	public Cycle getCycle() {
	    return new Unicycle();
	}
    };

}

class Bicycle implements Cycle {
    public void ride() {
	System.out.println("Bicycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {

	@Override
	public Cycle getCycle() {
	    return new Bicycle();
	}
    };
}

class Tricycle implements Cycle {
    @Override
    public void ride() {
	// TODO Auto-generated method stub
	System.out.println("Tricycle ride");
    }

    public static CycleFactory factory = new CycleFactory() {

	@Override
	public Cycle getCycle() {
	    return new Tricycle();
	}
    };
}

class Cycles {
    public static void rideCycle(CycleFactory cycle) {
	Cycle k = cycle.getCycle();
	k.ride();
    }
}

/**
 * @author Andrew
 * 
 */
public class Exercise16 {

    /**
     * @param args
     */

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Cycles.rideCycle(Unicycle.factory);
	Cycles.rideCycle(Bicycle.factory);
	Cycles.rideCycle(Tricycle.factory);
    }

}
