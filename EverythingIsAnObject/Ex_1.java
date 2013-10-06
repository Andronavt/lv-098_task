package EverythingIsAnObject;

/**
 * @author nazarko
 *
 */
/*Create a class containing an int and a char that are not initialized, and 
print their values to verify that Java performs default initialization.*/
public class Ex_1 {
	int i;
	char c;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_1 e = new Ex_1();
		System.out.println("EverythingIsAnObject / Ex_1");
		System.out.println("i = " + e.i + ";" + "\n" + "c = " + e.c + ";");
	}

}
