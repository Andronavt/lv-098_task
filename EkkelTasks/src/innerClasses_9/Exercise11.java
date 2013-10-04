/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 *
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test11 obj = new Test11();
	InterfTest11 obj2 = obj.method();
	obj2.f();
	//InnerTest11 obj3 = (InnerTest11)obj2; //cannot to be resolved to a type

    }

}
interface InterfTest11{
    void f();
}
class Test11{
    private class InnerTest11 implements InterfTest11{
	@Override
	public void f() {
	   System.out.println("InterfTest11 f()"); 	    
	}
    }
    InterfTest11 method(){
	return new InnerTest11();
    }
}
