package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Generator {
    private int k = 0;

    public String next() {
	switch (k) {
	default:
	case 0:
	    k++;
	    return "This";
	case 1:
	    k++;
	    return "is";
	case 2:
	    k++;
	    return "SPARTA";
	case 3:
	    k = 0;
	    return "!!!";
	}
    }

    public void fillArr(String[] s) {
	for (int i = 0; i < s.length; i++) {
	    s[i] = next();
	}
    }

    public Collection<String> fill(Collection<String> c, int k) {
	for (int i = 0; i < k; i++) {
	    c.add(next());
	}
	return c;
    }

}

public class Four {

    public static void main(String[] args) {
	Generator g = new Generator();
	String[] a = new String[4];
	g.fillArr(a);
	for (String s : a) {
	    System.out.println(s + ", ");
	}
	System.out.println("----------");
	System.out.println(g.fill(new ArrayList<String>(), 5));
	System.out.println(g.fill(new LinkedList<String>(), 5));
	System.out.println(g.fill(new HashSet<String>(), 5));
	System.out.println(g.fill(new TreeSet<String>(), 5));
    }

}
