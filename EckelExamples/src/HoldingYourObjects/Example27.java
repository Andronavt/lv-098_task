/**
 * 
 */
package HoldingYourObjects;
import java.util.*;
/**
 * @author Oleg
 * 
 * 
 *         Exercise 27: (2) Write a class called Command that contains a String
 *         and has a method operation( ) that displays the String. Write a
 *         second class with a method that fills a Queue with Command objects
 *         and returns it. Pass the filled Queue to a method in a third class
 *         that consumes the objects in the Queue and calls their operation( )
 *         methods.
 */
class Command {
	String value = "value" + i;
	private static int i;
	Command() {
		i++;
	}
	void operation() {
		System.out.println(value);
	}
}

class Filler {
	Queue<Command> fillMethod() {
		Queue<Command> finalQueue = new LinkedList<Command>();
		for (int i = 0; i < 5; i++) {
			finalQueue.offer(new Command());
		}
		return finalQueue;

	}
}

public class Example27 {

	public static void greatMethod(Queue<Command> in) {
		while (in.peek() != null)
			in.poll().operation();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Filler a = new Filler();
		greatMethod(a.fillMethod());
	}

}
