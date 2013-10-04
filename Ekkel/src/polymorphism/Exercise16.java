/**
 * 
 */
package polymorphism;

/**
 * @author orecto
 * 
 */
import java.util.Random;

import static staticPack.StaticPrint.print;

class AlertStatus {
	Integer status;

	AlertStatus() {
	}

	AlertStatus(int i) {
		status = i;
	}
}

class Starship {
	AlertStatus as;

	Starship() {
		as = new AlertStatus(0);
	}

	public void getStatus() {
		if (as.status > 0)
			print("Hight alert status");
		else if (as.status == 0)
			print("Medium alert status");
		else if (as.status < 0)
			print("Low alert status");
	}

	public void setStatus(int i) {
		as = new AlertStatus(i);
	}

	public void changeRandomStatus() {
		Random random = new Random();
		as = new AlertStatus(random.nextInt());
	}
}

public class Exercise16 {
	public static void main(String[] args) {
		Starship starship = new Starship();
		starship.getStatus();
		starship.changeRandomStatus();
		starship.getStatus();
		starship.changeRandomStatus();
		starship.getStatus();
		starship.changeRandomStatus();
		starship.getStatus();

		starship.setStatus(0);
		starship.getStatus();
	}
}
/*
 * Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 */