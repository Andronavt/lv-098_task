package eckel.initializationandcleanup;

public class Dog {

    void bark() {
	System.out.println("Gav norm");
    }

    void bark(int k) {
	System.out.println("Gav int");
    }

    void bark(double d, long l) {
	System.out.println("Gav double");
    }

    void bark(long l, double d) {
	System.out.println("Gav long");
    }

    public static void main(String[] args) {
	Dog d = new Dog();
	d.bark();
	d.bark(1.1, 1L);
	d.bark(1);
	d.bark(3l, 2.2);
    }

}
