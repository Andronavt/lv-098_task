/**
 * 
 */
package innerClasses_9;



/**
 * @author Богдан
 * 
 */
public class Exercise12 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test12().secondOutMet();

    }

}

interface InnerTest12{
    void changeOutField(int i);
    void callOutMet();
}
class Test12 {
    private int i;

    private void firstOutMet() {
	System.out.println("Call method Test7.firstOutMet()");
    }

    void secondOutMet() {
	System.out.println("Call method Test7.secondOutMet()");
	Test12 obj1 = new Test12();
	InnerTest12 obj = obj1.inner();
	obj.changeOutField(5);
	System.out.println("private int i = " + i);
	obj.callOutMet();
    }

    public InnerTest12 inner(){
	return new InnerTest12(){
   
        	public void changeOutField(int i) {
        	    Test12.this.i = i;
        	}
        
        	public void callOutMet() {
        	    Test12.this.firstOutMet();
        	}
        };
    }
}
