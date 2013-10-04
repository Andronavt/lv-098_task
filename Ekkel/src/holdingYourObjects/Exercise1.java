/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;

/**
 * @author orecto
 * 
 */
/*
 * Create a new class called Gerbil with an int gerbilNumber that�s initialized
 * in the constructor. Give it a method called hop( ) that displays which gerbil
 * number this is, and that it�s hopping. Create an ArrayList and add Gerbil
 * objects to the List. Now use the get( ) method to move through the List and
 * call hop( ) for each Gerbil
 */
public class Exercise1 {
	
	class Gerbil {
		private int gerbilNumber;

		public Gerbil(int i) {
			gerbilNumber = i;
		}

		public void hop() {
			System.out.println("Gerbil " + gerbilNumber + " hops.");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbil1 = new ArrayList<Gerbil>();
		for (int i = 1; i < 10; i++)
			gerbil1.add(new Exercise1().new Gerbil(i));
		for(Gerbil g : gerbil1){
			g.hop();
		}
	}
}


