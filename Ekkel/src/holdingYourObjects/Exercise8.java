/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author orecto
 * 
 */
/*
 * Modify Exercise l so it uses an Iterator to move through the List while
 * calling hop( )
 */
public class Exercise8 {
	public static void main(String[] args) {
		ArrayList<Exercise1.Gerbil> gerbil = new ArrayList<Exercise1.Gerbil>();
		
		for (int i = 1; i < 10; i++)
			gerbil.add(new Exercise1().new Gerbil(i));
		
		Iterator<Exercise1.Gerbil> it = gerbil.iterator();
//		while (it.hasNext()) {
//			Gerbil1 g = it.next();
//			g.hop();
//		}
		
		while (it.hasNext()) {
			it.next().hop();
		}
	}
}
