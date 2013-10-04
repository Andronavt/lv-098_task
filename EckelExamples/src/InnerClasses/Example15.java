/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */
class MyClass15 {
	private int i = 0;
	public MyClass15(int i) {
		this.i = i;
	}
	void show() {
		System.out.println(i);
	}
}
public class Example15 {

	public MyClass15 make(int intVal){
		return new MyClass15(intVal){};
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Example15 ex15= new Example15();
		ex15.make(100).show();
	}

}
