package eckel.accesscontrol;

public class ConnectionManager {

    private static final int SIZE = 5;
    private Connection[] connections;

    private class Connection {
	protected Connection() {
	    // System.out.println("Connection create");
	}
    }

    public ConnectionManager() {
	connections = new Connection[SIZE];
    }

    public static Connection createConnection() {
	return new ConnectionManager().new Connection();
    }

    public void addConnetction(int i, Connection c) {
	if (checkSize(i)) {
	    connections[i] = c;
	} else {
	    throw new ArrayIndexOutOfBoundsException();
	}
    }

    public void showArr() {
	for (Connection c : connections) {
	    System.out.println(c);
	}
    }

    protected boolean checkSize(int i) {
	if (i < SIZE) {
	    return true;
	}
	return false;
    }
}
