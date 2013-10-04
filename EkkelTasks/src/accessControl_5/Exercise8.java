/**
 * 
 */
package accessControl_5;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	for (int i = 0; i < 15; i++) {
	    ConnectionManager.addConnection();
	}
     }

}

class Connection {
    private final int id;
    private static int count = 0;

    private Connection() {
	id = count++;
	System.out.println("Connection #" + id + " created.");
    }

    static public Connection createConnection() {
	return new Connection();
    }
}

class ConnectionManager {
    static int freeCon = 0;
    static Connection[] array = new Connection[10];

    static Connection addConnection() {
	if (freeCon < 9) {
	    array[freeCon] = Connection.createConnection();
	    freeCon++;
	    return array[freeCon];
	} else {
	    System.out.println("Returns null");
	    return null;
	}
    }
}
