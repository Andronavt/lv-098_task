package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import eckel.typeinfo.pets.Pet;
import eckel.typeinfo.pets.Pets;

/*
 * ex 32
 */
class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

class NonCollectionSequence32 extends PetSequence implements Iterable {
    public Iterator<Pet> iterator() {
	return new Iterator<Pet>() {
	    private int index = 0;

	    public boolean hasNext() {
		return index < pets.length;
	    }

	    public Pet next() {
		return pets[index++];
	    }

	    public void remove() {
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

		    public void remove() {
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
		Collections.shuffle(shuffled, new Random());
		return shuffled.iterator();
	    }
	};
    }

}

public class ThirtyTwo {

    public static void main(String[] args) {
	NonCollectionSequence32 nc = new NonCollectionSequence32();
	System.out.print("pets: ");
	for (Pet p : nc.pets)
	    System.out.print(p + " ");
	System.out.println();
	System.out.print("reversed: ");
	for (Pet p : nc.reversed())
	    System.out.print(p + " ");
	System.out.println();
	System.out.print("randomized: ");
	for (Pet p : nc.randomized())
	    System.out.print(p + " ");
    }
}
