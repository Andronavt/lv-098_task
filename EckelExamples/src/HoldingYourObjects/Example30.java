/**
 * 
 */
package HoldingYourObjects;
import java.util.*;
/**
 * @author Oleg
 * 
 *         Exercise 30: (5) Modify CollectionSequence.java so that it does not
 *         inherit from AbstractCollection, but instead implements Collection.
 */

class InterfaceVsIterator {
	public static void display(Iterator<MyPet> it) {
		while (it.hasNext()) {
			MyPet p = it.next();
			System.out.print(p.id() + ":" + p + " ");
		}
		System.out.println();
	}
	public static void display(Collection<MyPet> pets) {
		for (MyPet p : pets)
			System.out.print(p.id() + ":" + p + " ");
		System.out.println();
	}

}

class MyPet {
	public String id() {
		return "id";
	}

}

public class Example30 implements Collection<MyPet> {

	Example30(){
		for(int i=0;i<5;i++){
			pets[i]= new MyPet();
		}
	}
	private MyPet[] pets = new MyPet[5];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example30 ex30 = new Example30();
InterfaceVsIterator.display(ex30);
InterfaceVsIterator.display(ex30.iterator());
	}
	

	@Override
	public boolean add(MyPet arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends MyPet> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		if (this.size() != 0)
			for (MyPet p : pets)
				p = null;

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return (this.size() == 0) ? true : false;
	}

	@Override
	public Iterator<MyPet> iterator() {
		return new Iterator<MyPet>() {
			private int index = 0;
			public boolean hasNext() {
				return index < pets.length; 
			}
			public MyPet next() { return pets[index++]; }
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return pets.length;
	}

	@Override
	public Object[] toArray() {
		return pets;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
