/**
 * 
 */
package HoldingYourObjects;
import InnerClasses.*;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Oleg
 *
 *Exercise 13:   (3) In the innerclasses/GreenhouseController.java example, the 
class Controller uses an ArrayList. Change the code to use a LinkedList instead, and use 
an Iterator to cycle through the set of events.  
 */

class Event{
	public void action(){
		System.out.println("adasqdasd");
	}
}

public class Example13 {

	private LinkedList<Event> eventList = new LinkedList<Event>();
	public void addEvent(Event c) { eventList.add(c); }		
	public void run() {		
		LinkedList<Event> eventListCopy = 
			new LinkedList<Event>(eventList);
		ListIterator<Event> it 
			= eventListCopy.listIterator();
		while(it.hasNext()) {	
			it.next().action();
			it.previous();		
			System.out.println(it.next());		
		}
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	}

}
