/**
 * 
 */
package Strings;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author Oleg
 * 
 */
public class Example3 {
	private String name;
	private Formatter f;
	public Example3(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}
	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		Example3 tommy = new Example3("Tommy", new Formatter(System.err));
		Example3 terry = new Example3("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}