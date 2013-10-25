package eckel.controllingexecution;

public class Seven {
    public static void main(String[] args) {
	for (int i = 1; i <= 1000; i++) {
	    if (i == 99) {
		break;
	    }
	    System.out.println("break: " + i);
	}
	for (int i = 1; i <= 1000; i++) {
	    if (i == 99) {
		return;
	    }
	    System.out.println("return: " + i);
	}
    }

}
