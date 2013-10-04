/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 *
 */
abstract class AbsPrint{
	abstract void print();
}

class RealiseAbsPrint extends AbsPrint{
	int i=9;
	RealiseAbsPrint(){
		System.out.println("Constructor");
		print();
	}
	void print()
	{
		System.out.println("Printing "+i);
	}
}
public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RealiseAbsPrint a= new RealiseAbsPrint();
	}

}
