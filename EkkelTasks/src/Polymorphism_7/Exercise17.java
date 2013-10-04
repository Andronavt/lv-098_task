/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 * 
 */
public class Exercise17 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Cycle4[] array = new Cycle4[] { new Unicycle4(), new Bicycle4(),
		new Tricycle4() };
	//for (Cycle4 c : array) { 
	 //   c.balance(); // Error: Cycle4 don't have balance()
	//}
	//Cycle4 obj1 = new Cycle4();
	//Unicycle4 obj2 = (Unicycle4)obj1; //ClassCastException
	//obj2.balance();
	//Cycle4 obj3 = new Cycle4();
	//Bicycle4 obj4 = (Bicycle4)obj3; ClassCastException
	//obj4.balance();
	//Cycle4 obj5 = new Cycle4();
	//Tricycle4 obj6 = (Tricycle4)obj5;
	//obj6.balance(); //Error: Tricycle4  don't have balance()
	
    }

}

class Cycle4 {
    void ride() {
	System.out.println("Cycle");
    }
}

class Unicycle4 extends Cycle4 {
    void ride() {
	System.out.println("Unicycle");
    }

    void balance() {
	System.out.println("Balance Unicycle");
    }
}

class Bicycle4 extends Cycle4 {
    void ride() {
	System.out.println("Bycycle");
    }

    void balance() {
	System.out.println("Balance Bicycle");
    }
}

class Tricycle4 extends Cycle4 {
    void ride() {
	System.out.println("Tricycle");
    }
}
