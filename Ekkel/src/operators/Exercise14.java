/**
 * 
 */
package operators;

/**
 * @author orecto
 * 
 */
public class Exercise14 {
	public static void main(String[] args) {
		String str1 = "Orest";
		String str2 = "oresT";
		String str3 = "orest";
		String str4 = "Orest";

		compStr(str1, str2);
		compStr(str1, str3);
		compStr(str1, str4);
		compStr(str2, str3);
		compStr(str2, str4);
		compStr(str3, str4);
	}

	public static void compStr(String str1, String str2) {
		System.out.println(str1 + ".equals(" + str2 + ") => "
				+ str1.equals(str2));
		System.out.println(str1 + " == " + str2 + " => " + (str1 == str2));
		System.out.println(str1 + " != " + str2 + " => " + (str1 != str2)
				+ '\n');
	}
}