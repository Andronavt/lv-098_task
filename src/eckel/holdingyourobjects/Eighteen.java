package eckel.holdingyourobjects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * ex 18 and 19
 */

class Gerbbil {
    private int gerbilNumber;

    public Gerbbil(int gerbilNumber) {
	this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
	System.out.println("Gerbilnumber: " + gerbilNumber + " hop");
    }
}

public class Eighteen {
    public static void main(String[] args) {
	Map<String, Gerbbil> gerbil = new HashMap<String, Gerbbil>();
	gerbil.put("This", new Gerbbil(0));
	gerbil.put("is", new Gerbbil(1));
	gerbil.put("SPARTA", new Gerbbil(2));
	gerbil.put("!!!", new Gerbbil(3));
	System.out.println(gerbil);
	System.out.println();
	Set<String> sortKey = new TreeSet<String>(gerbil.keySet());
	System.out.println(sortKey);
	System.out.println();
	Map<String, Gerbbil> sortGerbils = new LinkedHashMap<String, Gerbbil>();
	for (String s : sortKey) {
	    System.out.print("Add " + s + ", ");
	    sortGerbils.put(s, gerbil.get(s));
	}
	System.out.println();
	System.out.println();
	System.out.println(sortGerbils);
	System.out.println();
	Map<String, Gerbbil> sortGerbils2 = new TreeMap<String, Gerbbil>(gerbil);
	System.out.println(sortGerbils2);

	System.out.println("--------- 19 -------");

	Set<String> hashedKeys = new HashSet<String>(gerbil.keySet());
	System.out.println("HashSet: " + hashedKeys);
	System.out.println();
	Map<String, Gerbbil> hashedGerbils = new LinkedHashMap<String, Gerbbil>();
	for (String s : hashedKeys) {
	    System.out.print("Add " + s + ", ");
	    hashedGerbils.put(s, gerbil.get(s));
	}
	System.out.println();
	System.out.println();
	System.out.println("From HashSet: " + hashedGerbils);

	System.out.println();
	Set<String> linkedHashedKeys = new LinkedHashSet<String>(
		gerbil.keySet());
	System.out.println("LinkedHashSet: " + linkedHashedKeys);
	System.out.println();
	Map<String, Gerbbil> linkedHashedGerbils = new LinkedHashMap<String, Gerbbil>();
	for (String s : linkedHashedKeys) {
	    System.out.print("Add " + s + ", ");
	    linkedHashedGerbils.put(s, gerbil.get(s));
	}
	System.out.println();
	System.out.println();
	System.out.println("From LinkedHashSet: " + linkedHashedGerbils);
    }
}
