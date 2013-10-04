/**
 * 
 */
package AccessControl;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Oleg
 * 
 */

class ConnectionManager {
    ConnectionManager() {
    }

    class Connection {
	Connection() {
	}
    }

    private Connection[] a;

    public static Connection createcon() {
	return new ConnectionManager().new Connection();
    }

    public void createconarray() {
	a = new Connection[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Connection();
	}

    }

    public Connection getcon(int i) {
	if (i > a.length)
	    return null;
	return a[i];
    }
}

public class Example8 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ConnectionManager a = new ConnectionManager();
	a.createcon();
	System.out.println(a.getcon(111));
    }

}
