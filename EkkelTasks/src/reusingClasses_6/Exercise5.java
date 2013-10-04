/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new C();

    }

}
class A{
    A(){
	System.out.println("Create A");
    }
}
class B{
    B(){
	System.out.println("Create B");
    }
}
class C extends A{
    B obj = new B();
}
