/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Repeat the previous exercise but define the inner class within a scope within
 * a method
 */
public class Exercise10 {
	public static void main(String[] args) {
		Outer3 temp = new Outer3();
		System.out.println(temp.methOuter(2).meth());
		//System.out.println(temp.methOuter(1).meth());
	}
}
