/**
 * 
 */
package innerClasses;

/**
 * @author orecto
 * 
 */
/*
 * Create a class containing an inner class that itself contains an inner class.
 * Repeat this using nested classes. Note the names of the .class files produced
 * by the compiler
 */
public class Exercise19 {
	Exercise19() {
		System.out.println("Ex19()");
	}

	private class Inner {
		Inner() {
			System.out.println("Ex19Inner()");
		}

		private class InnerInInner {
			InnerInInner() {
				System.out.println("Ex19InnerInner()");
			}
		}
	}

	private static class Nested {
		Nested() {
			System.out.println("Ex19Nested()");
		}

		private static class NestedInNested {
			NestedInNested() {
				System.out.println("Ex19NestedNested()");
			}
		}
	}

	public static void main(String[] args) {
		Nested en = new Nested();
		Nested.NestedInNested enn = new Nested.NestedInNested();
		
		Exercise19 exercise19 = new Exercise19();
		Exercise19.Inner exeInn = exercise19.new Inner();
		Exercise19.Inner.InnerInInner exeInnInn = exeInn.new InnerInInner();
	}
}