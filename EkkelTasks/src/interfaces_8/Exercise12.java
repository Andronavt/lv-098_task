/**
 * 
 */
package interfaces_8;

/**
 * @author Богдан
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Adventure.main(args);

    }

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
interface CanClimb{
    void climb();
}

class ActionCharacter {
    public void fight() {
	System.out.println("fight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
    System.out.println("swim");
    }

    public void fly() {
	System.out.println("fly");
    }
   
    public void climb() {
         System.out.println("climb");
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
    public static void z(CanClimb x){
	x.climb();
    }

    public static void w(ActionCharacter x) {
	x.fight();
    }
    

    public static void main(String[] args) {
	Hero h = new Hero();
	t(h); // Treat it as a CanFight
	u(h); // Treat it as a CanSwim
	v(h); // Treat it as a CanFly
	z(h); // Treat it as a CanClimb
	w(h); // Treat it as an ActionCharacter
    }
}