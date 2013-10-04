/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 * 
 */

class OutOfRangeException extends RuntimeException {
	OutOfRangeException(){
		System.out.println("OUT OF RANGE");
	}
}

public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 14; i++) {
			switch (i) {
				case 0 :
				case 1 :
				case 2 :
				case 3 :
				case 4 :
				case 5 :
					System.out.println("Не задовільно");
					break;
				case 6 :
				case 7 :
				case 8 :
					System.out.println("Задовільно");
					break;
				case 9 :
				case 10 :
					System.out.println("Добре");
					break;
				case 11 :
				case 12 :
					System.out.println("Відмінно");
					break;
				default :
					throw new OutOfRangeException();

			}
		}

	}

}
