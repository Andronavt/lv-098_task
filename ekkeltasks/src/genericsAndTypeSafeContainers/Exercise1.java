/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.ArrayList;

/**
 * @author Andrew
 * 
 */
/*
 * (2) Create a new class called Gerbil with an int gerbilNumber that’s
 * initialized in the constructor. Give it a method called hop( ) that displays
 * which gerbil number this is, and that it’s hopping. Create an ArrayList and
 * add Gerbil objects to the List. Now use the get( ) method to move through the
 * List and call hop( ) for each Gerbil.
 */
class Gerbil {
    int k;

    Gerbil(int k) {
	this.k = k;
    }

    int hop() {
	return k;
    }

}

public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Gerbil> gerbil = new ArrayList<Gerbil>();
	for (int i = 0; i < 5; i++) {
	    gerbil.add(new Gerbil(i));
	}
	for (int i = 0; i < 5; i++) {
	    System.out.println(gerbil.get(i).hop());
	}

    }

}
