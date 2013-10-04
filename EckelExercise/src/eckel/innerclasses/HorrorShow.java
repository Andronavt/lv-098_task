package eckel.innerclasses;

/*
 * ex 14
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

public class HorrorShow {
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

    public DangerousMonster createMonster() {
	return new DangerousMonster() {

	    @Override
	    public void menace() {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void destroy() {
		// TODO Auto-generated method stub

	    }
	};
    }

    public Vampire createVampire() {
	return new Vampire() {

	    @Override
	    public void kill() {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void menace() {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void destroy() {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void drinkBlood() {
		// TODO Auto-generated method stub

	    }
	};
    }

    public static void main(String[] args) {
	// DangerousMonster barney = new DragonZilla();
	// u(barney);
	// v(barney);
	// Vampire vlad = new VeryBadVampire();
	// u(vlad);
	// v(vlad);
	// w(vlad);
	HorrorShow h = new HorrorShow();
	h.u(h.createMonster());
	h.v(h.createVampire());
	h.w(h.createVampire());
    }
} // /:~
