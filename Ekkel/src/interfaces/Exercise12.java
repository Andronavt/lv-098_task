/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */

/*
 * In Adventure.java, add an interface called CanClimb, following the form of
 * the other interfaces
 */
public class Exercise12 {
	public static void main(String[] args) {
		Hero h = new Hero();
		Adventure.t(h); // ���������� ������ � �������� ���� CanFight
		Adventure.u(h); // ���������� ������ � �������� ���� CanSwim
		Adventure.v(h); // ���������� ������ � �������� ���� CanFly
		Adventure.w(h); // ���������� ������ � �������� ActionCharacter
		Adventure.r(h); // ���������� ������ � �������� CanClimb
	}
}

interface CanClimb {
	void climb();
}

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println("Fight");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly,
		CanClimb {
	public void swim() {
		System.out.println("Swim");
	}

	public void fly() {
		System.out.println("Fly");
	}

	public void climb() {
		System.out.println("Climb");
	}
}

class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}

	public static void u(CanSwim x) {
		x.swim();
	}

	public static void v(CanFly x) {
		x.fly();
	}

	public static void w(ActionCharacter x) {
		x.fight();
	}

	public static void r(CanClimb x) {
		x.climb();
	}
}
