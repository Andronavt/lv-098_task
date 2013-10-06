package EverythingIsAnObject;

/**
 * @author nazarko
 * 
 */
/*Turn the Incrementable code fragments into a working program. */
public class Ex_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EverythingIsAnObject / Ex_7");
		System.out.println("StaticTest.i = " + StaticTest.i);
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		
		Incrementable inc = new Incrementable();
		inc.increment();
		
		System.out.println("Incrementabled : ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		
		Incrementable.increment();
		
		System.out.println("Incrementabled : ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);

	}

}

/**
 * @author nazarko
 *
 */
class Incrementable {
	static void increment() {
		StaticTest.i++;
	}
}

/**
 * @author nazarko
 *
 */
class StaticTest {
	static int i = 100;
}