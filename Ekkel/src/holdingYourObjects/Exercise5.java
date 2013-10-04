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
 * Modify ListFeatures.java so that it uses Integers (remember autoboxing!)
 * instead of Pets, and explain any difference in results
 */
public class Exercise5 {
	public static List<Integer> listOfRandInteger(int length, int randMax) {
		Random rand = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < length; i++)
			list.add(rand.nextInt(randMax));
		return list;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> list = listOfRandInteger(7, 10);
		print("1: " + list);
		
		Integer h = new Integer(rand.nextInt(10));
		list.add(h);
		print("2: " + list);
		print("3: " + list.contains(h));
		
		list.remove(h);
		print("3.5: " + list);
		
		Integer p = list.get(2);
		print("4: " + p + " " + list.indexOf(p));
		
		Integer i = new Integer(rand.nextInt(10));
		print("5: " + i + " " + list.indexOf(i));
		print("6: " + list.remove(i));
		print("7: " + list.remove(p));
		print("8: " + list);
		
		list.add(3, new Integer(rand.nextInt(10)));
		print("9: " + list);
		
		List<Integer> subList = list.subList(1, 4);
		print("sublist: " + subList);
		print("10: " + list.containsAll(subList));
		
		// will also sort sub elements within list:
		Collections.sort(subList);
		print("sorted sublist: " + subList);
		print("11: " + list.containsAll(subList));
		print("11.25: " + list);
		
		// will also shuffle sub elements within list:
		Collections.shuffle(subList, rand);
		print("11.5: " + list);
		print("shuffled sublist: " + subList);
		print("12: " + list.containsAll(subList));
		
		List<Integer> copy = new ArrayList<Integer>(list);
		print("12.5: " + list);
		subList = Arrays.asList(list.get(1), list.get(4));
		print("sub: " + subList)
		;
		copy.retainAll(subList);
		print("13: " + copy);
		
		copy = new ArrayList<Integer>(list);
		copy.remove(2);
		print("14: " + copy);
		
		copy.removeAll(subList);
		print("15: " + copy);
		
		if (copy.size() > 1) // to avoid out of bounds exception
			copy.set(1, 8); // autoboxing int -> Integer
		print("16: " + copy);
		
		if (copy.size() > 2)
			copy.addAll(2, subList);
		print("17: " + copy);
		
		print("18: " + list.isEmpty());
		list.clear();
		print("19: " + list);
		
		print("20: " + list.isEmpty());
		list.addAll(listOfRandInteger(4, 10));
		print("21: " + list);
		
		Object[] o = list.toArray();
		print("22: " + o[3]);
		Integer[] ia = list.toArray(new Integer[0]);
		print("23: " + ia[3]);
	}
}
