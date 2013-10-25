package eckel.holdingyourobjects;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String line;

    Command(String line) {
	this.line = line;
    }

    void operation() {
	System.out.println(line);
    }
}

class Second {
    Queue<Command> q;

    Queue<Command> init() {
	q = new LinkedList<Command>();
	for (int i = 0; i < 10; i++) {
	    q.offer(new Command(i + " "));
	}
	return q;
    }
}

public class TwentySeven {
    public static void creator(Queue<Command> q) {
	while (q.peek() != null) {
	    q.poll().operation();
	}
    }

    public static void main(String[] args) {
	Second s = new Second();
	creator(s.init());
    }

}
