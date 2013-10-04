/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


/**
 * 
 * Exercise 10:   (2) Change Exercise 9 in the Polymorphism chapter to use an ArrayList to 
 * hold the Rodents and an Iterator to move through the sequence of Rodents.  
 */
/**
 * @author Oleg
 *
 */

class Rodent {
    void meth1() {
	System.out.println("Rodent meth1");
    }

    void meth2() {
	System.out.println("Rodent meth2");
    }
}

class Mouse extends Rodent {
    void meth1() {
	System.out.println("Mouse meth1");
    }

    void meth2() {
	System.out.println("Mouse meth2");
    }
}

class Gerbil2 extends Rodent {
    void meth1() {
	System.out.println("Gerbil1 meth1");
    }

    void meth2() {
	System.out.println("Gerbil1 meth2");
    }
}

class GetSomeRodent{
	private Random rand= new Random();
	public Rodent getSomeRodent(){
		switch(rand.nextInt(2)){
			default:
			case 1:return new Mouse();
			case 2:return new Gerbil2();
			
		}
	}
}

public class Example10 {

	private static GetSomeRodent getSomeRodent = new GetSomeRodent();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Rodent> rodentArray = new ArrayList<Rodent>();
		for(int i=0;i<4;i++){
			rodentArray.add(getSomeRodent.getSomeRodent());
		}
		Iterator<Rodent> it = rodentArray.iterator();
		while(it.hasNext())
		{
			Rodent r= it.next();
			r.meth1();
			r.meth2();
		}
		
	}

}
