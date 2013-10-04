/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Andrew
 * 
 */

class Exercise56 {
    // method to make a List<String> with random values < n:
    public static List<String> listOfRandString(int length, int n) {
	Random rand = new Random();
	List<String> li = new ArrayList<String>();
	for (int i = 0; i < length; i++)
	    li.add(Integer.toString(rand.nextInt(n)));
	return li;
    }

    public static void main(String[] args) {
	Random rand = new Random();
	List<String> li = listOfRandString(7, 10);
	System.out.println("1: " + li);
	String h = new String(Integer.toString(rand.nextInt(10)));
	li.add(h);
	System.out.println("2: " + li);
	System.out.println("3: " + li.contains(h));
	// removes the first instance equivalent to String h:
	li.remove(h);
	System.out.println("3.5: " + li);
	String p = li.get(2);
	System.out.println("4: " + p + " " + li.indexOf(p));
	String cy = new String(Integer.toString(rand.nextInt(10)));
	System.out.println("5: " + cy + " " + li.indexOf(cy));
	System.out.println("6: " + li.remove(cy));
	System.out.println("7: " + li.remove(p));
	System.out.println("8: " + li);
	li.add(3, new String(Integer.toString(rand.nextInt(10))));
	System.out.println("9: " + li);
	List<String> sub = li.subList(1, 4);
	System.out.println("sublist: " + sub);
	System.out.println("10: " + li.containsAll(sub));
	// will also sort sub elements within li:
	Collections.sort(sub);
	System.out.println("sorted sublist: " + sub);
	System.out.println("11: " + li.containsAll(sub));
	System.out.println("11.25: " + li);
	// will also shuffle sub elements within li:
	Collections.shuffle(sub, rand);
	System.out.println("11.5: " + li);
	System.out.println("shuffled sublist: " + sub);
	System.out.println("12: " + li.containsAll(sub));
	List<String> copy = new ArrayList<String>(li);
	System.out.println("12.5: " + li);
	sub = Arrays.asList(li.get(1), li.get(4));
	System.out.println("sub: " + sub);
	copy.retainAll(sub);
	System.out.println("13: " + copy);
	copy = new ArrayList<String>(li);
	copy.remove(2);
	System.out.println("14: " + copy);
	copy.removeAll(sub);
	System.out.println("15: " + copy);
	if (copy.size() > 1) // to avoid out of bounds exception
	    copy.set(1, "8"); // autoboxing int -> String
	System.out.println("16: " + copy);
	if (copy.size() > 2)
	    copy.addAll(2, sub);
	System.out.println("17: " + copy);
	System.out.println("18: " + li.isEmpty());
	li.clear();
	System.out.println("19: " + li);
	System.out.println("20: " + li.isEmpty());
	li.addAll(listOfRandString(4, 10));
	System.out.println("21: " + li);
	Object[] o = li.toArray();
	System.out.println("22: " + o[3]);
	String[] ia = li.toArray(new String[0]);
	System.out.println("23: " + ia[3]);
    }
}

public class Exercise6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Exercise56.main(args);
    }

}
