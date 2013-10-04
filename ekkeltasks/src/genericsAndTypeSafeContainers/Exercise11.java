/**
 * 
 */
package genericsAndTypeSafeContainers;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * @author Andrew
 * 
 */
/*
 * (2) Write a method that uses an Iterator to step through a Collection and
 * print the toString( ) of each object in the container. Fill all the different
 * types of Collections with objects and apply your method to each container.
 */

public class Exercise11 {

    /**
     * @param args
     */
    public static void printCollection(Collection c)
    {
	Iterator<Collection> iterator = c.iterator();
	while(iterator.hasNext())
	    System.out.print(iterator.next() + " ");
	System.out.println();
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<String> string = new ArrayList<String>(Arrays.asList("pryvit","haha","ce tak kruto"));
	ArrayList<Integer> integer = new ArrayList<Integer>(Arrays.asList(1,2,15));
	HashSet<Double> double1 = new HashSet<Double>(Arrays.asList(3.11,10.15,15.28,25.03));
	TreeSet<String> string2 = new TreeSet<String>(Arrays.asList("pryvit","haha","ce tak kruto"));
	printCollection(string);
	printCollection(integer);
	printCollection(double1);
	printCollection(string2);


    }

}
