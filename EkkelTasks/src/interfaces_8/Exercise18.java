/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	cycleConsumer(new UnicycleFactory());
	cycleConsumer(new BicycleFactory());
	cycleConsumer(new TricycleFactory());

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
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
	return new Tricycle();
    }
}