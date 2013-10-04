/**
 * 
 */
package holdingYourObjects;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author orecto
 * 
 */
/*
 * Fill a HashMap with key-value pairs. Print the results to show ordering by
 * hash code. Extract the pairs, sort by key, and place the result into a
 * LinkedHashMap. Show that the insertion order is maintained.
 */
public class Exercise18 {
	class Test {
		private int i;

		Test(int i) {
			this.i = i;
		}

		/**
		 * @return the i
		 */
		public int getI() {
			return i;
		}

		/**
		 * @param i
		 *            the i to set
		 */
		public void setI(int i) {
			this.i = i;
		}
	}

	public static void main(String[] args) {
		Map<String, Test> testHashMap = new HashMap<String, Test>();
		for (int i = 0; i < 10; i++) {
			testHashMap.put("Obj " + i, new Exercise18().new Test(i));
		}

		System.out.println(testHashMap);
		System.out.println();
		Set<String> testTreeSet = new TreeSet<String>(testHashMap.keySet());
		System.out.println(testTreeSet);
		System.out.println();
		Map<String, Test> testLinkedHashMap = new LinkedHashMap<String, Test>();
		for (String s : testTreeSet) {
			System.out.print("Adding " + s + ", ");
			testLinkedHashMap.put(s, testHashMap.get(s));
		}
		System.out.println('\n');
		System.out.println(testLinkedHashMap);
		System.out.println();

		Map<String, Test> testTreeMap = new TreeMap<String, Test>(testHashMap);
		System.out.println(testTreeMap);
	}

}
