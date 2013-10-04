/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Andrew
 * 
 */
/*
 * (3) Fill a HashMap with key-value pairs. Print the results to show ordering
 * by hash code. Extract the pairs, sort by key, and place the result into a
 * LinkedHashMap. Show that the insertion order is maintained.
 */
public class Exercise18 {

    /**
     * @param args
     */
    public static void map18()
    {
	HashMap<String,Integer> hashmap = new HashMap<>();
	for(int i = 0;i<15;i++)
	{
	    hashmap.put("value"+i, i+3);
	}
	System.out.println(hashmap);
	Set<String> sorted = new TreeSet<>(hashmap.keySet());
	LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
	for(String k: sorted)
	{
	    link.put(k, hashmap.get(k));
	}
	System.out.println(link);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        map18();
    }

}
