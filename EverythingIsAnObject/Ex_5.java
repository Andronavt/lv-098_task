package EverythingIsAnObject;

/**
 * @author nazarko
 *
 */
public class Ex_5 {

	/**
	 * 
	 * @param args
	 */
	/*Modify the previous exercise so that the values of the data in DataOnly 
are assigned to and printed in main( )*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EverythingIsAnObject / Ex_5");
		DataOnly data = new DataOnly(); 
		data.i = 111; 
		data.d = 222.222; 
		data.b = false; 
		data.show();
	}

}

class DataOnly { 
	int i; 
	double d; 
	boolean b; 
	void show(){
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);	
	}
} 
