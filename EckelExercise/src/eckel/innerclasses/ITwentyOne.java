package eckel.innerclasses;

public interface ITwentyOne {
    public void say();

    public static class Nested {
	static void doubleSay(ITwentyOne i) {
	    i.say();
	}
    }

}
