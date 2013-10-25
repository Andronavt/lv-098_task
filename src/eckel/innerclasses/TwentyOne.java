package eckel.innerclasses;

public class TwentyOne implements ITwentyOne {

    @Override
    public void say() {
	System.out.println("This is SPARTA~!");
    }

    public static void main(String[] args) {
	TwentyOne t = new TwentyOne();
	new Nested().doubleSay(t);
    }
}
