/**
 * 
 */
package Interfaces;

/**
 * @author Oleg
 *
 */

interface Int1{
	void meth1();
}
interface Int2 extends Int1{
	void meth2();
}
interface Int3 extends Int1{
	void meth3();
}
interface Int4 extends Int2,Int3{
	void meth4();
}
class Realisation implements Int4{

	@Override
	public void meth2() {
		
	}

	@Override
	public void meth1() {
		
	}

	@Override
	public void meth3() {
		
	}

	@Override
	public void meth4() {
		
	}
	
}
public class Example13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Realisation r = new Realisation();
		r.meth1();
		r.meth2();
		r.meth3();
		r.meth4();

	}

}
