package polymorphism;

/**
 * Created with IntelliJ IDEA. User: Andrew Date: 27.09.13 Time: 14:45 To change
 * this template use File | Settings | File Templates.
 */
class Rodent {
    
    void eat() {
	System.out.println("Rodent eat");
    }

    void run() {
	System.out.println("Rodent run");
    }

    void sleep() {
	System.out.println("Rodent sleep");
    }
}

class Mouse extends Rodent {
    void eat() {
	System.out.println("Mouse eat");
    }

    void run() {
	System.out.println("Mouse run");
    }

    void sleep() {
	System.out.println("Mouse sleep");
    }
}

class Gerbil extends Rodent {
    void eat() {
	System.out.println("Gerbil eat");
    }

    void run() {
	System.out.println("Gerbil run");
    }

    void sleep() {
	System.out.println("Gerbil sleep");
    }
}

class Hamster extends Rodent {
    void eat() {
	System.out.println("Hamster eat");
    }

    void run() {
	System.out.println("Hamster run");
    }

    void sleep() {
	System.out.println("Hamster sleep");
    }
}

public class Exercise9 {
    public static void main(String[] args) {
	Rodent[] rodent = new Rodent[] { new Hamster(), new Gerbil(),
		new Mouse() };
	for (Rodent r : rodent) {
	    r.eat();
	    r.run();
	    r.sleep();
	}
    }
}
