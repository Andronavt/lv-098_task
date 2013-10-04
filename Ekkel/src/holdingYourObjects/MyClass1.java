/**
 * 
 */
package holdingYourObjects;

/**
 * @author orecto
 * 
 */
/*
 * ������� �������� ��������: ��������� � ����� ������� <- ����������� ���� �
 * ������������� ��� �� ������� <- ���������� ����.
 */
public class MyClass1 {

	static void showMark(int mark) {
		switch (mark) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("�� ���������");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���������");
			break;
		case 9:
		case 10:
			System.out.println("�����");
			break;
		case 11:
		case 12:
			System.out.println("������");
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
 * ������ �������� mark: int. ������� ��������, �� ������ ���� �� ����� �����
 * ���� ������� �� �������� mark <6 - "�� ���������" <=8 - "���������" <=10 -
 * "�����" <=12 - "������" >12 �������� ������� ���� OutOfRangeException
 */

