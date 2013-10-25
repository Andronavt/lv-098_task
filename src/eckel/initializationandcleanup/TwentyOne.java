package eckel.initializationandcleanup;

public class TwentyOne {

    public void showEnum() {
	for (EnumTwentyOne e : EnumTwentyOne.values()) {
	    System.out.println(e + " ordinal " + e.ordinal());
	}
    }

    public void showEnumDescription(EnumTwentyOne e) {
	switch (e) {
	case ONE:
	    System.out.println("1");
	    break;
	case FIVE:
	    System.out.println("5");
	    break;
	case TEN:
	    System.out.println("10");
	    break;
	case TWENTY:
	    System.out.println("20");
	    break;
	case FIFTY:
	    System.out.println("50");
	    break;
	case HUNREDE:
	    System.out.println("100");
	    break;
	}
    }

    public static void main(String[] args) {
	new TwentyOne().showEnum();
	new TwentyOne().showEnumDescription(EnumTwentyOne.FIFTY);

    }

}
