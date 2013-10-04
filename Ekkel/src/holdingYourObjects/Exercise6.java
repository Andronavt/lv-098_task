/**
 * 
 */
package holdingYourObjects;

import java.util.*;

import static staticPack.StaticPrint.print;
/**
 * @author orecto
 * 
 */
/*
 * Modify ListFeatures.java so that it uses Strings instead of Pets, and explain
 * any difference in results
 */
public class Exercise6 {
	public static void main(String[] args) {
		Random rand = new Random();
		List<String> list = new ArrayList<String>();
		print("0: " + list);
		Collections.addAll(list, "OrestO", "orc", "orest", "OresytO", "Oresto");
		print("1: " + list);
		String h = new String("hi");
		list.add(h);
		print("2: " + list);
		print("3: " + list.contains(h));
		// removes the first instance equivalent to String h:
		list.remove(h);
		print("3.5: " + list);
		String p = list.size() > 2 ? list.get(2) : null;
		print("4: " + p + " " +  list.indexOf(p));
		String cy = new String("cy");
		print("5: " + cy +" " + list.indexOf(cy));
		print("6: " + list.remove(cy));
		print("7: " + list.remove(p));
		print("8: " + list);
		if(list.size() > 3)
			list.add(3, "SYPER");
		print("9: " + list);
		if(list.size() < 4) {
			List<String> s = 
			   Arrays.asList("go", "for", "a", "walk");
			list.addAll(0, s);
		}
		List<String> sub = list.subList(1, 4);
		print("sublist: " + sub);
		print("10: " + list.containsAll(sub));
		// will also sort sub elements within list:
		Collections.sort(sub);
		print("sorted sublist: " + sub);
		print("11: " + list.containsAll(sub));
		print("11.25: " + list);
		// will also shuffle sub elements within list:
		Collections.shuffle(sub, rand);
		print("11.5: " + list);
		print("shuffled sublist: " + sub);
		print("12: " + list.containsAll(sub));
		List<String> copy = new ArrayList<String>(list);
		print("12.5: " + list);
		if(list.size() < 5) {
			list.add("Plus1");
			list.add("Plus2");
		}
		sub = Arrays.asList(list.get(1), list.get(4));
		print("sub: " + sub);	
		copy.retainAll(sub);
		print("13: " + copy);
		copy = new ArrayList<String>(list);
		copy.remove(2);
		print("14: " + copy);
		copy.removeAll(sub); 
		print("15: " + copy);
		if(copy.size() > 1) // to avoid out of bounds exception
			copy.set(1, "generous"); 
		print("16: " + copy);
		if(copy.size() > 2)
			copy.addAll(2, sub);
		print("17: " + copy);
		print("18: " + list.isEmpty());
		list.clear();
		print("19: " + list);
		print("20: " + list.isEmpty());
		list.addAll(0, sub);
		list.addAll(2, sub);
		print("21: " + list);
		Object[] o = list.toArray();
		print("22: " + o[3]);
		String[] sa = list.toArray(new String[0]);
		print("23: " + sa[3]);
	}
}
