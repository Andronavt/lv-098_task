/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Богдан
 * 
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test7[] array = new Test7[10];
	List<Test7> list  = new ArrayList();
	List<Test7> list2  = new ArrayList();
	for (int i = 0; i < array.length; i++) {
	    array[i]=new Test7(i);
	}
	for(Test7 t: array){
	    list.add(t);
	}
	System.out.println("List before remove()");
	for(Test7 t: list){
	    System.out.println(t);
	}
	list2 = list.subList(3, 7);
	list.removeAll(list2);
	System.out.println("List after remove()");
	for(Test7 t: list){
	    System.out.println(t);
	}
	

    }
}

class Test7 {
    private int i;

    Test7(int i) {
	this.i = i;
    }

    public String toString() {
	return "Test7.i= " + i;
    }

}
