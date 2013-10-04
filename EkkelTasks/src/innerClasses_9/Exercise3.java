/**
 * 
 */
package innerClasses_9;

import innerClasses_9.Outer2.Inner2;

/**
 * @author Богдан
 *
 */
public class Exercise3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Outer2 obj = new Outer2("text");
	Inner2 obj2 = obj.createIn();
	System.out.println(obj2);


    }

}
class Outer2 {
    private String s;
    Outer2(String s){
	this.s = s;
	System.out.println("Class Outer");
    }
    public Inner2 createIn(){
	return new Inner2();
    }
    class Inner2{
	Inner2(){
	    System.out.println("Class Inner");
	}
	public String toString(){
	    return s;
	}
    }
    
    
}
