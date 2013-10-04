/**
 * Exercise 32:   (2) Following the example of MultilterableClass, add reversed( ) and 
 * randomized( ) methods to NonCollectionSequence.java, as well as making 
 * NonCollectionSequence implement Iterable, and show that all the approaches work in 
 * foreach statements.  
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise32 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	NonCollectionSequence obj = new NonCollectionSequence();
	System.out.println("reverce()");
	for(Pet p :obj.reversed()){
	    System.out.println(p.toSring());
	}
	System.out.println("randomized()");
	for(Pet p: obj.randomized()){
	    System.out.println(p.toSring());
	}

    }

}

class PetSequence {
    protected Pet[] pets = Pet.createArray(8);
}

class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
	return new Iterator<Pet>() {
	    private int index = 0;

	    public boolean hasNext() {
		return index < pets.length;
	    }

	    public Pet next() {
		return pets[index++];
	    }

	    public void remove() { // Not implemented
		throw new UnsupportedOperationException();
	    }
	};
    }

    public Iterable<Pet> reversed() {
	return new Iterable<Pet>() {
	    public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
		    int current = pets.length - 1;

		    public boolean hasNext() {
			return current > -1;
		    }

		    public Pet next() {
			return pets[current--];
		    }

		    public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		    }
		};
	    }
	};
    }

    public Iterable<Pet> randomized() {
	return new Iterable<Pet>() {
	    public Iterator<Pet> iterator() {
		List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
		Collections.shuffle(shuffled, new Random(47));
		return shuffled.iterator();
	    }
	};
    }

    
}
