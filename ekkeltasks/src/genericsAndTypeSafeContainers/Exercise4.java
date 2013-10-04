/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedList;

/**
 * @author Andrew
 * 
 */
/*
 * Create a generator class that produces character names (as String objects)
 * from your favorite movie (you can use Snow White or Star Wars as a fallback)
 * each time you call next( ), and loops around to the beginning of the
 * character list when it runs out of names. Use this generator to fill an
 * array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet,
 * then print each container.
 */
class Generator {
    int i=0;
    public String next() {
	switch(i) {
		default:
		case 0 : i++; return "Snow White";
		case 1 : i++; return "Bashful";
		case 2 : i++; return "Doc";
		case 3 : i++; return "Dopey";
		case 4 : i++; return "Grumpy";
		case 5 : i++; return "Happy";
		case 6 : i++; return "Sleepy";
		case 7 : i = 0; return "Sneezy";			
	}
}
    public void fillArray(String[] a) {
	for(int i = 0; i < a.length; i++)
		a[i] = next();
}
    Collection fillCollections(Collection<String> collection, int size) {
	for(int i=0;i < size; i++)
	    collection.add(next());
	return collection;
    }
    

}

public class Exercise4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Generator generator = new Generator();
	String[] array = new String[10];
	generator.fillArray(array);
	for(String k : array)
	{
	    System.out.print(k + " ");
	}
	System.out.println();
	System.out.println(generator.fillCollections(new ArrayList<String>(),10));
	System.out.println(generator.fillCollections(new LinkedList<String>(),10));
	System.out.println(generator.fillCollections(new HashSet<String>(),7));
	System.out.println(generator.fillCollections(new TreeSet<String>(),11));
    }

}
