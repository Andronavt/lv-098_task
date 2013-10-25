package eckel.accesscontrol;

public class Eight {
    public static void main(String[] args) {
	ConnectionManager connectionManager = new ConnectionManager();
	// for (int i = 0; i < 5; i++) {
	// connectionManager.addConnetction(i,
	// connectionManager.createConnection());
	// }
	for (int i = 0; i < 5; i++) {
	    connectionManager.addConnetction(i,
		    connectionManager.createConnection());
	}
	connectionManager.showArr();

    }

}
