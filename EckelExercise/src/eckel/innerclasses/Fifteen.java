package eckel.innerclasses;

public class Fifteen {
    public FifteenBase create(String line) {
	return new FifteenBase(line) {

	};
    }

    public static void main(String[] args) {
	Fifteen f = new Fifteen();
	System.out.println(f.create("THis is SPARTA!!!~~~!"));
    }
}
