/**
 * 
 */
package Polymorphism_7;

import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	StarShip starShip = new StarShip();
	starShip.whatAlert();
	starShip.change();
	starShip.whatAlert();
;

    }

}

class AlertSatus {
    public void alert() {
    }
}

class LowAlert extends AlertSatus {
    @Override
    public void alert() {
	System.out.println("Low Alert");
    }
}

class MidAlert extends AlertSatus {
    @Override
    public void alert() {
	System.out.println("Mid ALert");
    }
}

class HiAlert extends AlertSatus {
    @Override
    public void alert() {
	System.out.println("Hi Alert");
    }
}

class StarShip {
    AlertSatus shipAlert = new LowAlert();

    public void change() {
	Random rand = new Random(47);
	switch (rand.nextInt(4)) {
	case 0:
	    shipAlert = new LowAlert();
	    break;
	case 1:
	    shipAlert = new MidAlert();
	    break;
	case 2:
	    shipAlert = new HiAlert();
	    break;
	default:
	    break;
	}
    }
    public void whatAlert(){
	shipAlert.alert();
    }
}