package eckel.operators;

/*
 * Write a method that displays char values in binary form.Demostrate it using several different characters.
 */

public class Thirteen {

    public void printBinaryChar(char c) {
	int myc = (int) c;
	System.out.println(Integer.toBinaryString(myc));
    }

    public static void main(String[] args) {
	Thirteen thirteen = new Thirteen();
	thirteen.printBinaryChar('a');
	thirteen.printBinaryChar('b');
	thirteen.printBinaryChar('T');
    }

}
