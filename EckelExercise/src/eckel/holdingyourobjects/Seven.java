package eckel.holdingyourobjects;

import java.util.ArrayList;
import java.util.List;

public class Seven {
    private Seven[] seven;

    Seven(int size) {
	seven = new Seven[size];
    }

    public String toString() {
	return "Seven";
    }

    public static void main(String[] args) {
	List<Seven> seven = new ArrayList<Seven>();
	for (int i = 0; i < 10; i++) {
	    seven.add(new Seven(i));
	}
	for (Seven s : seven) {
	    System.out.println(s);
	}
	System.out.println("---------");
	List<Seven> subseven = seven.subList(2, 5);
	for (Seven s : subseven) {
	    System.out.println(s);
	}
	System.out.println("------");
	List<Seven> newseven = new ArrayList<Seven>(seven);
	newseven.removeAll(subseven);
	seven = newseven;
	System.out.println(seven);
    }

}
