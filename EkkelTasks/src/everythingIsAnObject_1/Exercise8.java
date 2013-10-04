/**
 * 
 */
package everythingIsAnObject_1;

/**
 * @author Богдан
 * 
 */
public class Exercise8 {

   

    public static void main(String[] args) {
	StaticClass obj1 = new StaticClass();
	StaticClass obj2 = new StaticClass();
	StaticClass obj3 = new StaticClass();
	StaticClass obj4 = new StaticClass();
	System.out.println("befor: field text = " + obj1.text);
	obj1.text = "Its a static field";
	System.out.println("after:");
	System.out.println("obj1.text = " + obj1.text);
	System.out.println("obj2.text = " + obj1.text);
	System.out.println("obj3.text = " + obj1.text);
	System.out.println("obj4.text = " + obj1.text);
    }

}

class StaticClass {
    static String text = "xxx";
}