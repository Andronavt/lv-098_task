/**
 * 
 */
package holdingYourObjects;

import static staticPack.StaticPrint.print;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author orecto
 * 
 */
/*
 * Fill a LinkedHashMap with String keys and objects of your choice. Now extract
 * the pairs, sort them based on the keys, and reinsert them into the Map
 */
public class Exercise24 {
	public static void main(String[] args) {
		Map<String, Integer> testLinkedHashMap = new LinkedHashMap<String, Integer>();
		for (int i = 15; i > 0; i--) {
			testLinkedHashMap.put("OrestO " + (char)(i + 75), i);

		}
		print("Map befor sorting: " + testLinkedHashMap);
		Map<String, Integer> tempMap = new TreeMap<String, Integer>(
				testLinkedHashMap);
		testLinkedHashMap = new LinkedHashMap<String, Integer>(tempMap);
		print("Map after sorting: " + testLinkedHashMap);
	}

}
