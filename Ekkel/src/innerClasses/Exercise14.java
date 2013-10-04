/**
 * 
 */
package innerClasses;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 * 
 */
/*
 * Modify interfaces/HorrorShow.java to implement DangerousMonster and Vampire
 * using anonymous classes
 */
public class Exercise14 {
	public static void main(String[] args) {
		HorrorShow show = new HorrorShow();
		show.u(show.dangerousMonster());
		show.v(show.dangerousMonster());
		show.u(show.vampire());
		show.v(show.vampire());
		show.w(show.vampire());
	}
}

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
	}

	public void destroy() {
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destroy() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public DangerousMonster dangerousMonster() {
		return new DangerousMonster() {
			public void menace() {
				print("DangerousMonster Menace");
			}

			public void destroy() {
				print("DangerousMonster Destroy");
			}
		};
	}

	public Vampire vampire() {
		return new Vampire() {
			public void menace() {
				print("Vampire Menace");
			}

			public void destroy() {
				print("Vampire Destroy");
			}

			public void kill() {
				print("Vampire Kill");
			}

			public void drinkBlood() {
				print("Vampire DrinkBlood");
			}
		};
	}
}