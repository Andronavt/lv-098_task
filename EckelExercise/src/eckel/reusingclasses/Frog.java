package eckel.reusingclasses;

public class Frog extends Amphibian {

    @Override
    protected void die() {
	System.out.println("die frog");
	super.die();
    }

    public static void main(String[] args) {
	Frog frog = new Frog();
	Amphibian.upCast(frog);
    }
}
