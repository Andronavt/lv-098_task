/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * @author Andrew
 * 
 */
/*
 * Modify Exercise l so it uses an Iterator to move through the List while
 * calling hop( ).
 */
class Gerbil1 {
    int k;

    Gerbil1(int k) {
	this.k = k;
    }

    static ArrayList<Gerbil1> ArrayList(int size) {
	ArrayList<Gerbil1> list = new ArrayList<Gerbil1>();
	for (int i = 0; i < size; i++)
	    list.add(new Gerbil1(i));
	return list;
    }

    int hop() {
	return k;

    }

    public String toString() {
	return "" + this.k;
    }
}

public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Gerbil1> gerbils = Gerbil1.ArrayList(14);
	Iterator<Gerbil1> iterator = gerbils.iterator();
	while (iterator.hasNext()) {
	    Gerbil1 g = iterator.next();
	    System.out.println(g.hop());
	}

    }

}
