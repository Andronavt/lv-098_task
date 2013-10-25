package eckel.reusingclasses;

public class Amphibian {
    protected void die() {
	System.out.println("die amphibian");
    }

    protected static void upCast(Amphibian a) {
	a.die();
    }

}
