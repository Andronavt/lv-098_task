/**
 * 
 */
package everythingIsAnObject_1;

/**
 * @author Богдан
 * 
 */
public class Exercise7 {

    static int i;

    public static void main(String[] args) {
	System.out.println("i befor increnent = " + i);
	Incrementable.increment();
	System.out.println("i after increnent = " + i);
    }

}

class Incrementable {
    static void increment() {
	Exercise7.i++;
    }
}
