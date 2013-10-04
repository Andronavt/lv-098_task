/**
 * 
 */
package innerClasses;


/**
 * @author orecto
 * 
 */
/*
 * Create a class with an inner class that has a non-default constructor (one
 * that takes arguments). Create a second class with an inner class that
 * inherits from the first inner class
 */
interface K{
	void meth1();
	void meth2();
}
public class Exercise26 {
	class Inner2 extends Base1.Inner1{
		Inner2(Base1 obj){
			obj.super("OrestO");
			System.out.println("OrestO Base2.Inner");
		}
	}
	public static void main(String[] args) {
		Base1 b1 = new Base1();
		Exercise26 b2 = new Exercise26();
		Inner2 i2 = b2. new Inner2(b1);
	}
}

class Base1 implements K{
	class Inner1{
		Inner1(String str){
			System.out.println(str + " Base1.Inner");
		}
	}

	/* (non-Javadoc)
	 * @see innerClasses.K#meth1()
	 */
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see innerClasses.K#meth2()
	 */
	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		
	}
	
}