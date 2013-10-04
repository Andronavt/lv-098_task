/**
 * 
 */
package innerClasses;
import iExample.IInnerEx6;
/**
 * @author orecto
 * 
 */
/*
 * Create a private inner class that implements a public interface. Write a
 * method that returns a reference to an instance of the private inner class,
 * upcast to the interface. Show that the inner class is completely hidden by
 * trying to downcast to it
 */
public class Exercise11 {
	public static void main(String[] args) {
		Outer4 o4 = new Outer4();
		System.out.println(o4.getInnerClass().meth());
		// System.out.println(((Inner)o4.getInnerClass()).meth());
	}
}
class Outer4 {
	private class Inner implements IInnerEx6 {
		public String meth(){
			return "Oresto";
		}
	}
	IInnerEx6 getInnerClass() {
		return new Inner();
	}
}