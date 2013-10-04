/**
 * 
 */
package reusingClasses;

import static staticPack.StaticPrint.print;

/**
 * @author orecto
 * 
 */
public class Exercise3 extends Drawing {
	// public Exercise3() {
	// print("Exercise3 constructor");
	// }

	public static void main(String[] args) {
		Exercise3 x = new Exercise3();
	}
}

class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	// Drawing() {
	// print("Drawing constructor");
	// }
}
