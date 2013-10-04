/**
 * 
 */
package innerClasses_9;

import innerClasses_9.Test26_1.InnerTest26_1;

/**
 * @author Богдан
 * 
 */
public class Exercise26 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test26_1 obj1 = new Test26_1();
	Test26_2 obj2 = new Test26_2();
	Test26_2.InnerTest26_2 obj3 = obj2.new InnerTest26_2(obj1,"text");
	

    }

}

class Test26_1 {
    class InnerTest26_1 {
	public InnerTest26_1(String s) {
	    System.out.println("Create InnerTest26_1 woth text: " + s);
	}
    }
}
class Test26_2{
    class InnerTest26_2 extends Test26_1.InnerTest26_1{
	public InnerTest26_2(Test26_1 t, String s) {
	    t.super(s);
	    System.out.println("Create InnerTest26_2 woth text: " + s);
	}
    }
}
