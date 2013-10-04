package eckel.interfaces;

public abstract class Rodent {
    Rodent() {
	System.out.println("Rodent.constructor()");
    }

    protected abstract void beBorn();

    protected abstract void toDie();
}
