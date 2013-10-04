/**
 * Exercise 27:   (2) Write a class called Command that contains a String and has a 
 * method operation( ) that displays the String. Write a second class with a method that fills 
 * a Queue with Command objects and returns it. Pass the filled Queue to a method in a 
 * third class that consumes the objects in the Queue and calls their operation( ) methods.  
 */
package holdingYourObjects_10;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Богдан
 * 
 */
public class Exercise27 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test27_2 obj1 = new Test27_2();
	Test27_3 obj2 = new Test27_3();
	obj2.calls(obj1.fillQueue(10));

    }

}

class Command {
    String s;

    Command(String s) {
	this.s = s;
    }

    public void operation() {
	System.out.println(s);
    }
}

class Test27_2 {
    public Queue<Command> fillQueue(int count) {
	Queue<Command> q = new LinkedList();

	for (int i = 0; i < count; i++) {
	    q.add(new Command("" + i * 10));
	}
	return q;
    }
}
class Test27_3{
    public void calls(Queue<Command> q){
	for(Command c:q){
	    c.operation();
	}
    }
}
