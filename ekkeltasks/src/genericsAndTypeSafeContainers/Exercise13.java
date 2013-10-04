/**
 * 
 */
package genericsAndTypeSafeContainers;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * @author Andrew
 * 
 */
/*
 * (3) In the innerclasses/GreenhouseController.java example, the class
 * Controller uses an ArrayList. Change the code to use a LinkedList instead,
 * and use an Iterator to cycle through the set of events.
 */
import innerClasses.*;

class Controller13 {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<Event>();

    public void addEvent(Event c) {
	eventList.add(c);
    }

    public void run() {
	Iterator<Event> iterator = eventList.iterator();
	while (iterator.hasNext()) {
	    iterator.next().action();
	}
    }
}

public class Exercise13 {

    /**
     * @param args
     */

    public static void main(String[] args) {

    }

}
