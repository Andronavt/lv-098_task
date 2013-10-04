///**
// * 
// */
//package controllingExecution;
//
//import java.util.ArrayList;
//
///**
// * @author orecto
// * 
// */
//public class Exercise10 {
//	public static void main(String[] args) {
//		VampireNumber vn = new VampireNumber();
//		//System.out.println(vn.getDigit(12345, 1));
//		//vn.permutation("123456");
//		vn.showFourDigitNumbers();
//	}
//
//}
//
//class VampireNumber {
//	public void showFourDigitNumbers() {
//		for (int i = 1000; i < 9999; i++) {
//			permutation(Integer.toString(i));
//		}
//	}
//
//	public static void checking(int vamNum) {
//		int claw1 = Integer.parseInt(getDigit(vamNum, 1) + getDigit(vamNum, 2));
//		int claw2 = Integer.parseInt(getDigit(vamNum, 3) + getDigit(vamNum, 4));
//		if (claw1 * claw2 == vamNum)
//			System.out.println("vampiric number is: " + vamNum
//					+ " it claws is: " + claw1 + ", " + claw2 + ".");
//	}
//
//	public static String getDigit(int num, int digit) {
//		int temp1 = num;
//		int temp2 = 0;
//		ArrayList<Integer> numArr = new ArrayList<Integer>();
//		while (temp1 > 0) {
//			temp2 = temp1;
//			temp1 /= 10;
//			numArr.add(temp2 - temp1 * 10);
//		}
//		return Integer.toString(numArr.get(numArr.size() - digit));
//	}
//
//	public static void permutation(String str) {
//		permutation("", str);
//	}
//
//	private static void permutation(String prefix, String str) {
//		int n = str.length();
//		if (n == 0){
//			//System.out.println(prefix);
//			checking(Integer.parseInt(prefix));
//		}
//		else {
//			for (int i = 0; i < n; i++)
//				permutation(prefix + str.charAt(i),
//						str.substring(0, i) + str.substring(i + 1, n));
//		}
//	}
//}
///*
// * A vampire number has an even number of digits and is formed by multiplying a
// * pair of numbers containing half the number of digits of the result. The
// * digits are taken from the original number in any order. Pairs of trailing
// * zeroes are not allowed. Examples include: 1260 = 21 * 60 1827 = 21 * 87 2187
// * = 27 * 81 Write a program that finds all the 4-digit vampire numbers.
// * (Suggested by Dan Forhan.)
// */

/**
 * 
 */
package controllingExecution;

import java.util.Arrays;

/**
 * @author Andrew
 * 
 */
public class Exercise10 {

	/**
	 * @param args
	 */
	/**
	 * @param i1
	 * @param j1
	 * @return
	 */
	public static boolean checkVampire(int i, int j) {
		char[] s = Integer.toString(i * j).toCharArray();
		char[] a = ((Integer.toString(i)) + Integer.toString(j)).toCharArray();
		Arrays.sort(s);
		Arrays.sort(a);
		return Arrays.equals(s, a);
	}

	public static void vampireNumbers() {
		for (int i = 11; i < 100; i++) {
			for (int j = i; j < 100; j++) {
				if (i * j > 1000) {
					if (checkVampire(i, j)) {
						System.out.print(i + "*" + j + " = ");
						System.out.println(i * j);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise10.vampireNumbers();
	}

}