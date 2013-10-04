/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Богдан
 *
 */
public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ListFeatures2.main(args);
    }

}

class ListFeatures2 {
    public static List<String> intGen(int array, int gen) {
	Random rand = new Random();
	List<String> list = new ArrayList<String>();
	for (int i = 0; i < array; i++)
	    list.add(String.valueOf(rand.nextInt(gen)));
	return list;
    }

    public static void main(String[] args) {
	Random rand = new Random();
	List<String> list = intGen(10, 9);
	System.out.println("1: " + list);
	String  h = new String(String.valueOf(rand.nextInt(10)));
	list.add(h);
	System.out.println("2: " + list);
	System.out.println("3: " + list.contains(h));
	// removes the first instance equivalent to Integer h:
	list.remove(h);
	System.out.println("3.5: " + list);
	String p = list.get(2);
	System.out.println("4: " + p + " " + list.indexOf(p));
	Integer cy = new Integer(rand.nextInt(10));
	System.out.println("5: " + cy + " " + list.indexOf(cy));
	System.out.println("6: " + list.remove(cy));
	System.out.println("7: " + list.remove(p));
	System.out.println("8: " + list);
	list.add(String.valueOf(3));
	System.out.println("9: " + list);
	List<String> sub = list.subList(1, 4);
	System.out.println("sublist: " + sub);
	System.out.println("10: " + list.containsAll(sub));
	// will also sort sub elements within li:
	Collections.sort(sub);
	System.out.println("sorted sublist: " + sub);
	System.out.println("11: " + list.containsAll(sub));
	System.out.println("11.25: " + list);
	// will also shuffle sub elements within li:
	Collections.shuffle(sub, rand);
	System.out.println("11.5: " + list);
	System.out.println("shuffled sublist: " + sub);
	System.out.println("12: " + list.containsAll(sub));
	List<String> copy = new ArrayList<String>(list);
	System.out.println("12.5: " + list);
	sub = Arrays.asList(list.get(1), list.get(4));
	System.out.println("sub: " + sub);
	copy.retainAll(sub);
	System.out.println("13: " + copy);
	copy = new ArrayList<String>(list);
	copy.remove(2);
	System.out.println("14: " + copy);
	copy.removeAll(sub);
	System.out.println("15: " + copy);
	if (copy.size() > 1) // to avoid out of bounds exception
	    copy.set(1, String.valueOf(8)); // autoboxing int -> Integer
	System.out.println("16: " + copy);
	if (copy.size() > 2)
	    copy.addAll(2, sub);
	System.out.println("17: " + copy);
	System.out.println("18: " + list.isEmpty());
	list.clear();
	System.out.println("19: " + list);
	System.out.println("20: " + list.isEmpty());
	list.addAll(intGen(4, 10));
	System.out.println("21: " + list);
	Object[] o = list.toArray();
	System.out.println("22: " + o[3]);
	String[] ia = list.toArray(new String[0]);
	System.out.println("23: " + ia[3]);
    }
}
