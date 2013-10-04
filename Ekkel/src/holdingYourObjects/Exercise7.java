/**
 * 
 */
package holdingYourObjects;

import java.util.*;

/**
 * @author orecto
 * 
 */
/*
 * Create a class, then make an initialized array of objects of your class. Fill
 * a List from your array. Create a subset of your List by using subList( ),
 * then remove this subset from your List
 */
public class Exercise7 {
	public static void main(String[] args) {
		int size = 10;
		MyClass[] arr = new MyClass[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new MyClass();
		}

		for (MyClass temp : arr) {
			System.out.print(temp.id + " ");
		}
		System.out.println();
		
		List<MyClass> list = Arrays.<MyClass>asList(arr);
		for (MyClass temp : list) {
			System.out.print(temp.id + " ");
		}
		System.out.println();
		
		Set<MyClass> set = new HashSet<MyClass>(list.subList(1, 5));
		for (MyClass temp : set) {
			System.out.print(temp.id + " ");
		}
		System.out.println();
		
		List<MyClass> copy = new ArrayList<MyClass>(list);
		copy.removeAll(set);
		for (MyClass temp : copy) {
			System.out.print(temp.id + " ");
		}
		System.out.println();
	}

}

class MyClass {
	private static int i = 0;
	public int id = i++;
}