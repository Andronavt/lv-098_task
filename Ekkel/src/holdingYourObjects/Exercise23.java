/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * @author orecto
 * 
 */
/*
 * Starting with Statistics.java, create a program that runs the test repeatedly
 * and looks to see if any one number tends to appear more than the others in
 * the results
 */

class Statistics {

	public static int startTest(int numb) {
		Random random = new Random();
		Map<Integer, Integer> numberMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			// Produce a number between 0 and 20:
			int rnd = random.nextInt(numb);
			Integer freq = numberMap.get(rnd);
			numberMap.put(rnd, freq == null ? 1 : freq + 1);
		}
		System.out.println(numberMap);
		int max = 0;
		int keyMax = 0;
		for (int i = 0; i < numberMap.keySet().size(); i++) {
			if (max < numberMap.get(i)) {
				max = numberMap.get(i);
				keyMax = i;
			}
		}
		return keyMax;
	}

}

public class Exercise23 {
	public static void main(String[] args) {
		Map<Integer, Integer> mapOfTests = new TreeMap<Integer, Integer>();
		for (int i = 0; i < 2000; i++) {
			int x = Statistics.startTest(20);
			Integer freq = mapOfTests.get(x);
			mapOfTests.put(x, freq == null ? 1 : freq + 1);
		}
		System.out.println("Most often appears ints: " + mapOfTests);
		
		System.out.print("Lider/s: ");
		int max = 0;
		for (int i = 0; i < mapOfTests.keySet().size(); i++) {
			if (max < mapOfTests.get(i)) {
				max = mapOfTests.get(i);
			}
		}
		
		for (int i = 0; i < mapOfTests.keySet().size(); i++) {
			if (max == mapOfTests.get(i)) {
				System.out.println(i + " " + max);
			}
		}
		
		
	}

}
