/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author Oleg
 * 
 */

class Generator {
	private int count = 0;
	public String next() {
		switch (count) {
			default:
			case 0: count++; return "Breaking bad";
			case 1: count++; return "Sherlock";
			case 2: count++; return "Friends";
			case 3: count=0; return "HYMYM";
		}
	}
	public void inAString(String[] a){
		for(int i=0;i<a.length;i++){
			a[i]=next();
		}
		
	}
	public Collection inACollection(Collection<String> c, int n) {
		for(int i = 0; i < n; i++) c.add(next());
		return c;
	}
}
public class Example4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Generator gen = new Generator();		
		String[] a = new String[4];
		gen.inAString(a);
		for(String s : a) System.out.print(s + ", ");
		System.out.println();	
		System.out.println(gen.inACollection(new ArrayList<String>(), 4));
		System.out.println(gen.inACollection(new LinkedList<String>(), 4));
		System.out.println(gen.inACollection(new HashSet<String>(), 4));
		System.out.println(gen.inACollection(new LinkedHashSet<String>(), 4));
		System.out.println(gen.inACollection(new TreeSet<String>(), 4));
	}

}
