package EverythingIsAnObject;

/**
 * @author nazarko
 *
 */
/*Write a program that includes and calls the storage( ) method defined 
as a code fragment in this chapter.*/
public class Ex_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EverythingIsAnObject / Ex_6");
		Stor stor = new Stor();
		System.out.println(stor.storage("testString"));
	}


}

/**
 * @author nazarko
 *
 */
class Stor{
	int storage(String s) { 
		return s.length() * 2; 
	} 
	
}
