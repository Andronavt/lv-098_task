package eckel.controllingexecution;

public class Eight {

    public void switchWithBreak() {
	for (int i = 0; i < 5; i++) {
	    switch (i) {
	    case 1:
		System.out.println("1");
		break;
	    case 2:
		System.out.println("2");
		break;
	    case 3:
		System.out.println("3");
		break;
	    case 4:
		System.out.println("4");
		break;
	    case 5:
		System.out.println("5");
		break;
	    default:
		System.out.println("default");
		break;
	    }
	}
    }

    public void switchWitoutBreak() {
	for (int i = 0; i < 5; i++) {
	    switch (i) {
	    case 1:
		System.out.println("1");
		// break;
	    case 2:
		System.out.println("2");
		// break;
	    case 3:
		System.out.println("3");
		// break;
	    case 4:
		System.out.println("4");
		// break;
	    case 5:
		System.out.println("5");
		// break;
	    default:
		System.out.println("default");
		// break;
	    }
	}
    }

    public static void main(String[] args) {
	new Eight().switchWithBreak();
	System.out.println("-------------");
	new Eight().switchWitoutBreak();
    }

}
