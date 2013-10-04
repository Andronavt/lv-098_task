/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */
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

    public DangerousMonster monsterMaker() {
	return new DangerousMonster() {
	    public void menace() {
		System.out.println("DangerousMonster Menace");
	    }

	    public void destroy() {
		System.out.println("DangerousMonster Destroy");
	    }
	};
    }

    public Vampire vampireMaker() {
	return new Vampire() {
	    public void menace() {
		System.out.println("Vampire Menace");
	    }

	    public void destroy() {
		System.out.println("Vampire Destroy");
	    }

	    public void kill() {
		System.out.println("Vampire Kill");
	    }

	    public void drinkBlood() {
		System.out.println("Vampire DrinkBlood");
	    }
	};
    }

    public static void main(String[] args) {
	HorrorShow show = new HorrorShow();
	HorrorShow.u(show.monsterMaker());
	HorrorShow.v(show.monsterMaker());
	HorrorShow.u(show.vampireMaker());
	HorrorShow.v(show.vampireMaker());
	HorrorShow.w(show.vampireMaker());
    }
}

public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	HorrorShow.main(args);
    }

}
