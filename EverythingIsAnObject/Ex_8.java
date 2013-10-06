/**
 * 
 */
package EverythingIsAnObject;

/**
 * @author nazarko
 *
 */
/*Write a program that demonstrates that, no matter how many objects 
you create of a particular class, there is only one instance of a particular static field in that 
class.*/
public class Ex_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EverythingIsAnObject / Ex_8");
		
		System.out.println("StaticTest.i = " + StaticTest.i);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		System.out.println("st1.i= " + st1.i);
		System.out.println("st2.i= " + st2.i);
		System.out.println("st3.i= " + st3.i);
		
		Incrementable.increment();
		
		System.out.println("Incrementabled : ");
		
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("st3.i = " + st3.i);
		
		Incrementable.increment();
		
		System.out.println("Incrementabled : ");

		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("st3.i = " + st3.i);
		
		st1.i = 111;
		
		System.out.println("st1.i = 3 ");
		System.out.println("st1.i = " + st1.i);
		System.out.println("st2.i = " + st2.i);
		System.out.println("st3.i = " + st3.i);
		
		System.out.println("new st");
		StaticTest st = new StaticTest();
		System.out.println("st.i = " + st.i);
	}

}