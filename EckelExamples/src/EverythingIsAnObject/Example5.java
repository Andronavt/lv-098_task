package EverythingIsAnObject;

public class Example5 {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
	Example5 ex5 = new Example5();
	ex5.b = true;
	ex5.d = 2.4;
	ex5.i = 100;
	System.out.println(ex5.b+" "+ex5.d+" "+ex5.i);
    }
}
