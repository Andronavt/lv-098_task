package eckel.holdingyourobjects;

import java.util.Collection;
import java.util.Iterator;

import eckel.typeinfo.pets.Pet;
import eckel.typeinfo.pets.Pets;

/*
 * ex 30
 */
class CollectionSequence30 implements Collection<Pet> {
    private Pet[] pets = Pets.createArray(8);

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

	    public void remove() { // not implemented
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

}

public class Thirty {
    public static void main(String[] args) {
	CollectionSequence30 c = new CollectionSequence30();
	// InterfaceVsIterator.display(c);
	// InterfaceVsIterator.display(c.iterator());
	for (Pet pet : c) {
	    System.out.println(pet);
	}
	Iterator<Pet> it = c.iterator();
	while (it.hasNext()) {
	    Pet p = it.next();
	    System.out.println(p.id() + ": " + p + " ");
	}
    }
}
