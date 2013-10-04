/**
 * 
 */
package Polymorphism_7;

/**
 * @author Богдан
 *
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sub obj1 = new Sub();
	Base obj2 = (Base)obj1;
	obj2.method1();

    }

}
class Base {
    void method1(){
	System.out.println("Base - Method 1");
	method2();
    }
    void method2(){
	System.out.println("Base - Method 2");
    }
}

class Sub extends Base{
    @Override
    void method2() {
	System.out.println("Sub - Method 2");
    }
}
