/**
 * 
 */
package ReusingClasses;

/**
 * @author Oleg
 * 
 */
class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void stop() {
    }

    public void service() {

    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

public class Example14 {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(), right = new Door(); // 2-door

    public Example14() {
	for (int i = 0; i < 4; i++)
	    wheel[i] = new Wheel();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	Example14 car = new Example14();
	car.left.window.rollup();
	car.wheel[0].inflate(72);
	car.engine.service();

    }

}
