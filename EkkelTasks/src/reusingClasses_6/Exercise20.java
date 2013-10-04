/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 * 
 */
public class Exercise20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}

class Test20{
    public void method1(){
	System.out.println("Test20 - method1");
    }
    private void method2(){
	System.out.println("Test20 - method2");
    }
}
class Test201 extends Test20{
   @Override
    public void method1(){
	System.out.println("Test201 - method1");
    }
   @Override
   private void method2(){
	System.out.println("Test201 - method2");
   }
}
