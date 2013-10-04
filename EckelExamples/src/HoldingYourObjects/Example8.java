/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Oleg
 *
 */
class Gerbil1 {
	private int a;
	Gerbil1(int a) {
		this.a = a;
	}
	void hop() {
		System.out.println(a + " Gerbil Hopping ");
	}
}
public class Example8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Gerbil1> gList = new ArrayList<Gerbil1>();
		for (int i = 0; i < 5; i++) {
			gList.add(new Gerbil1(i));

		}

		for(Gerbil1 i :gList){
			i.hop();
		}
		
		Iterator<Gerbil1> it= gList.iterator();
		while(it.hasNext()){
			it.next().hop();
		}
	}

}
