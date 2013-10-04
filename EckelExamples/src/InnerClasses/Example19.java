/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
public class Example19 {
	Example19() {
		System.out.println("Main Constructor");
	}

	private class Inner {
		Inner() {
			System.out.println("Inner");
		}
		private class InnerInner {
			InnerInner() {
				System.out.println("InnerInner");
			}
		}
	}
	private static class Nested {
		Nested() {
			System.out.println("Nested");
		}
		private static class NestedNested {
			public NestedNested() {

				System.out.println("NestedNested");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Nested a = new Nested();
		Nested.NestedNested b = new Nested.NestedNested();
		Example19 ex19 = new Example19();
		//Example19.Inner inner = Example19.new Inner();
	//	Example19.Inner.InnerInner asd = Example19.Inner.new InnerInner();

	}

}
