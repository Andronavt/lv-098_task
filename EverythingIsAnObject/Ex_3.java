package EverythingIsAnObject;

/**
 * @author nazarko
 *
 */
/*Find the code fragments involving ATypeName and turn them into a 
program that compiles and runs.*/
public class Ex_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EverythingIsAnObject / Ex_3");
		ATypeName a = new ATypeName(); 
		a.i = 1;
		a.d = 2.2;
		a.b = false;
		a.show();
	}

}

/**
 * @author nazarko
 *
 */
class ATypeName { 
	int i;
	double d;
	boolean b;
	void show(){
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
	}
} 