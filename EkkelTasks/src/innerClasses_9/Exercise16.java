/**
 * 
 */
package innerClasses_9;



/**
 * @author Богдан
 *
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	cycleConsumer(Unicycle.cf);
	cycleConsumer(Bicycle.cf);
	cycleConsumer(Tricycle.cf);

    }
    public static void cycleConsumer(CycleFactory cf){
	Cycle c = cf.getCycle();
	c.move();
	c.stop();
    }

}

interface Cycle {
    void move();

    void stop();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    @Override
    public void move() {
	System.out.println("Unicycle move");

    }

    @Override
    public void stop() {
	System.out.println("Unicycle stop");

    }
    public static CycleFactory cf= new CycleFactory(){
	public Cycle getCycle(){
	    return new Unicycle();
	}
    };
}

class Bicycle implements Cycle {
    @Override
    public void move() {
	System.out.println("Bicycle move");

    }

    @Override
    public void stop() {
	System.out.println("Bicycle stop");

    }
    public static CycleFactory cf= new CycleFactory(){
	public Cycle getCycle(){
	    return new Bicycle();
	}
    };
}

class Tricycle implements Cycle {
    @Override
    public void move() {
	System.out.println("Tricycle move");

    }

    @Override
    public void stop() {
	System.out.println("Tricycle stop");

    }
    public static CycleFactory cf= new CycleFactory(){
	public Cycle getCycle(){
	    return new Tricycle();
	}
    };
}


