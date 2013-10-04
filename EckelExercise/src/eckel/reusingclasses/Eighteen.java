package eckel.reusingclasses;

public class Eighteen {
    static final int k = 10;
    final int a = 120;

    public static void main(String[] args) {
	System.out.println(Eighteen.k);
	System.out.println(new Eighteen().a);
    }

}
