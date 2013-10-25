package eckel.polymorphism;

public class Gerbil extends Rodent {

    Gerbil() {
	System.out.println("Gerbil.constructor");
    }

    @Override
    protected void beBorn() {
	System.out.println("Gerbil.beBorn()");
    }

    @Override
    protected void toDie() {
	System.out.println("Gerbil.toDie()");
    }
}
