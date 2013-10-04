/**
 * 
 */
package holdingYourObjects_10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Богдан
 * 
 */
public class Exercise14 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	List<Integer> list = new LinkedList();
	for (int i = 0; i < 10; i++) {
	    list.add(i);
	}
	System.out.println("Befor middle insert:");
	System.out.println(Arrays.toString(list.toArray()));
	for (int i = 10; i < 60; i+=10) {
	    midInsert(list, i);
	}System.out.println("After middle insert:");
	System.out.println(Arrays.toString(list.toArray()));
	

    }
    public static void midInsert(List<Integer> list, Integer i){
	int count = 0;
	ListIterator<Integer> iter1 = list.listIterator();
	while(iter1.hasNext()){
	    iter1.next();
	    count++;
	}
	ListIterator<Integer> iter2 = list.listIterator();
	for (int j = 0; j < (count/2); j++) {
	    iter2.next();
	}
	    iter2.add(i);
	}
	
    }


