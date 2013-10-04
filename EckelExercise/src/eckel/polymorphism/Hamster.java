package eckel.polymorphism;

public class Hamster extends Rodent {

    Hamster() {
	System.out.println("Hamster.constructor");
    }

    @Override
    protected void beBorn() {
	System.out.println("Hamster.beBorn()");
    }

    @Override
    protected void toDie() {
	System.out.println("Hamster.toDie()");
    }
}
