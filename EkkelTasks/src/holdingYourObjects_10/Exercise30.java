/**
 * 
 */
package holdingYourObjects_10;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Богдан
 * 
 */
public class Exercise30 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	CollectionSequence.main(args);

    }

}

class CollectionSequence implements Collection<Pet> {
    private Pet[] pets = Pet.createArray(10);

    public int size() {
	return pets.length;
    }

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

    public void clear() {
	if (this.size() != 0)
	    for (Pet p : pets)
		p = null;
    }

    public boolean retainAll(Collection<?> c) {
	throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
	throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Pet> c) {
	throw new UnsupportedOperationException();
    }

    public boolean contains(Object o) {
	throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
	return (this.size() == 0) ? true : false;
    }

    public boolean containsAll(Collection<?> c) {
	throw new UnsupportedOperationException();
    }

    public boolean remove(Object o) {
	throw new UnsupportedOperationException();
    }

    public boolean add(Pet p) {
	throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
	return pets;
    }

    public <T> T[] toArray(T[] a) {
	throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
	CollectionSequence c = new CollectionSequence();
	InterfaceVsIterator.display(c);
	InterfaceVsIterator.display(c.iterator());
    }
}

class Pet {
    private String name;

    Pet(String name) {
	this.name = name;
    }

    public String toSring() {
	return "Pet - " + name;
    }

    public String id() {
	return name;
    }

    public static Pet[] createArray(int count) {
	Pet[] p = new Pet[count];
	for (int i = 0; i < count; i++) {
	    p[i] = genPet();
	}
	return p;

    }

    private static Pet genPet() {
	Random rand = new Random();
	String s = "none";
	switch (rand.nextInt(4)) {
	case 0:
	    s = "Cat";
	    break;
	case 1:
	    s = "Dog";
	    break;
	case 2:
	    s = "Perrot";
	    break;
	case 3:
	    s = "Fish";
	    break;
	default:
	    break;
	}
	return new Pet(s);
    }

}

class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
	while (it.hasNext()) {
	    Pet p = it.next();
	    System.out.print(p.id() + ":" + p + " ");
	}
	System.out.println();
    }

    public static void display(Collection<Pet> pets) {
	for (Pet p : pets)
	    System.out.print(p.id() + ":" + p + " ");
	System.out.println();
    }

}
