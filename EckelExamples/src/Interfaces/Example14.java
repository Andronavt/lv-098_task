/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 * 
 */
interface Model {
	void met1();
	void met2();
}
interface View {
	void met3();
	void met4();
}
interface Controller {
	void met5();
	void met6();
}
interface MVC extends Model, View, Controller {
	void met7();

}

abstract class Person {
	abstract void sayhi();
}
class Programmer extends Person implements MVC {

	@Override
	public void met1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met5() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met6() {
		// TODO Auto-generated method stub

	}

	@Override
	public void met7() {
		// TODO Auto-generated method stub

	}

	@Override
	void sayhi() {
		// TODO Auto-generated method stub
		
	}

}

public class Example14 {

	public static void a(Model model) {
		model.met1();
	}
	public static void b(View view) {

		view.met3();
	}
	public static void c(Controller controller) {
		controller.met5();
	}
	public static void d(MVC mvc) {
		mvc.met7();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		a(programmer);
		b(programmer);
		c(programmer);
		d(programmer);
	}

}
