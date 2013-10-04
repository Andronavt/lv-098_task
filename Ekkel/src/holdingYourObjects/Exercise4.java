/**
 * 
 */
package holdingYourObjects;

import java.util.*;

/**
 * @author orecto
 * 
 */
/*
 * Create a generator class that produces character names (as String objects)
 * from your favorite movie (you can use Snow White or Star Wars as a fallback)
 * each time you call next( ), and loops around to the beginning of the
 * character list when it runs out of names. Use this generator to fill an
 * array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet,
 * then print each container
 */
public class Exercise4 {
	public static void main(String[] args) {
		Generator gen = new Generator();
		String[] a = new String[4];
		gen.fillA(a);
		for (String s : a)
			System.out.print(s + ", ");
		System.out.println();
		System.out.println(gen.fill(new ArrayList<String>(), 4));
		System.out.println(gen.fill(new LinkedList<String>(), 5));
		System.out.println(gen.fill(new HashSet<String>(), 4));
		System.out.println(gen.fill(new LinkedHashSet<String>(), 4));
		System.out.println(gen.fill(new TreeSet<String>(), 3));
	}
}

class Generator {
	int index = 0;

	public String next() {
		switch (index) {
		default:
		case 0:
			index++;
			return "Vito Carleone";
		case 1:
			index++;
			return "Sonny Carleone";
		case 2:
			index++;
			return "Michael Carleone";
		case 3:
			index = 0;
			return "Vinchenzo Carleone";
		}
	}

	public void fillA(String[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = next();
	}

	@SuppressWarnings("rawtypes")
	public Collection fill(Collection<String> c, int n) {
		for (int i = 0; i < n; i++)
			c.add(next());
		return c;
	}
}
