/**
 * 
 */
package holdingYourObjects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author orecto
 * 
 */
/* Repeat the previous exercise with a HashSet and LinkedHashSet. */
public class Exercise19 {
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
			testHashMap.put("Obj " + i, new Exercise19().new Test(i));
		}

		System.out.println(testHashMap);
		System.out.println();
		Set<String> testTreeSet = new HashSet<String>(testHashMap.keySet());
		System.out.println("HashSet: " + testTreeSet);
		System.out.println();
		Map<String, Test> testLinkedHashMap = new LinkedHashMap<String, Test>();
		for (String s : testTreeSet) {
			System.out.print("Adding " + s + ", ");
			testLinkedHashMap.put(s, testHashMap.get(s));
		}
		System.out.println('\n');
		System.out.println(testLinkedHashMap);
		System.out.println();
		System.out.println("From HashSet: " + testLinkedHashMap);
		System.out.println();

		Set<String> linkedHashedKeys = new LinkedHashSet<String>(
				testHashMap.keySet());
		System.out.println("LinkedHashSet: " + linkedHashedKeys);
		System.out.println();
		Map<String, Test> testLinkedHashMap1 = new LinkedHashMap<String, Test>();
		for (String s : linkedHashedKeys) {
			System.out.print("Adding " + s + ", ");
			testLinkedHashMap1.put(s, testHashMap.get(s));
		}
		System.out.println('\n');
		System.out.println("From LinkedHashSet: " + testLinkedHashMap1);
	}
}
