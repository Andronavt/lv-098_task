package eckel.polymorphism;

public class Rodent {

    Rodent() {
	System.out.println("Rodent.constructor()");
    }

    protected void beBorn() {
	System.out.println("Rodent.beBorn()");
    }

    protected void toDie() {
	System.out.println("Rodent.toDie()");
    }
}
