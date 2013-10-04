/**
 * 
 */
package Polymorphism;

/**
 * @author Oleg
 * 
 */
class Actor {
	public void act() {
	}
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}

}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();
	public void change() {
		actor = new SadActor();
	}
	public void performPlay() {
		actor.act();
	}
}

class AlertStatus {
	public void alert() {
	}
}

class NormalAlert extends AlertStatus {
	public void alert() {
		System.out.println("AlertStatus Normal");
	}
}

class HighAlert extends AlertStatus {
	public void alert() {
		System.out.println("AlertStatus High");
	}
}

class MaximumAlert extends AlertStatus {
	public void alert() {
		System.out.println("AlertStatus Maximum");
	}
}

class Starship {
	private AlertStatus alertStatus = new NormalAlert();
	public void normalAlert() {
		alertStatus = new NormalAlert();
	}
	public void highAlert() {
		alertStatus = new HighAlert();
	}
	public void maximumAlert() {
		alertStatus = new MaximumAlert();
	}
	public void checkAlertStatus() {
		alertStatus.alert();
	}
}
public class Example16 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();

		Starship ss = new Starship();
		ss.checkAlertStatus();
		ss.highAlert();
		ss.checkAlertStatus();
		ss.maximumAlert();
		ss.checkAlertStatus();
		ss.normalAlert();
		ss.checkAlertStatus();
	}

}
