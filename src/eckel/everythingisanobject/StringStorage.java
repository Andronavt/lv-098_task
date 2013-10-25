package eckel.everythingisanobject;

/*
 * Write a program that includes and calls the storage() method defined as a code fragment in this chapter.
 */

public class StringStorage {
    private static final String NAME = "Andrew";

    int storage(String s) {
	return s.length() * 2;
    }

    public static void main(String[] args) {
	StringStorage storage = new StringStorage();
	System.out.println("length: " + storage.storage(NAME));
    }

}
