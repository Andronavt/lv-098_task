package eckel.initializationandcleanup;

public class Seventeen {
    private static final int SIZE = 5;
    Seventeen[] arrSeventeens;

    public Seventeen() {
	arrSeventeens = new Seventeen[SIZE];
    }

    public Seventeen(String s) {
	System.out.println(s);
    }

    public static void main(String[] args) {
	Seventeen seventeen = new Seventeen();
	for (int i = 0; i < seventeen.arrSeventeens.length; i++) {
	    seventeen.arrSeventeens[i] = new Seventeen("NineA");
	}
    }

}
