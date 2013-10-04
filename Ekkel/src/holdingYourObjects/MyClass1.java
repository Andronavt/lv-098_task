/**
 * 
 */
package holdingYourObjects;

/**
 * @author orecto
 * 
 */
/*
 * Створіть наступну ієрархію: інтерфейс з одним методом <- абстрактний клас з
 * нереалізованим тим же методом <- конкретний клас.
 */
public class MyClass1 {

	static void showMark(int mark) {
		switch (mark) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("не задовільно");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("задовільно");
			break;
		case 9:
		case 10:
			System.out.println("добре");
			break;
		case 11:
		case 12:
			System.out.println("відмінно");
			break;
		default:
			throw new OutOfRangeException();
		}
	}



	public static void main(String[] args) {
		showMark(15);
	}
}
class OutOfRangeException extends RuntimeException {

}
/*
 * Задана величина mark: int. Описати фрагмент, що виконає друк на екран таких
 * фраз залежно від значення mark <6 - "не задовільно" <=8 - "задовільно" <=10 -
 * "добре" <=12 - "відмінно" >12 викинути виняток типу OutOfRangeException
 */

