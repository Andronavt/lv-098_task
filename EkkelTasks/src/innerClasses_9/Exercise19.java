/**
 * 
 */
package innerClasses_9;



/**
 * @author Богдан
 *
 */
public class Exercise19 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Test19 obj1 = new Test19();
	Test19.InnerTest19 obj2 = obj1.new InnerTest19();
	Test19.InnerTest19.InnerInnerTeat19 obj3 = obj2.new InnerInnerTeat19();
	Test19.NestedTest19 obj4 = new Test19.NestedTest19();
	Test19.NestedTest19.NestedNestedTest19 obj5 = new Test19.NestedTest19.NestedNestedTest19();
    }

}
class Test19{
    public Test19() {
	System.out.println("Test19");
    }
    class InnerTest19{
	public InnerTest19() {
	    System.out.println("InnerTest19");
	}
	class InnerInnerTeat19{
	    public InnerInnerTeat19() {
		System.out.println("InnerInnerTeat19");
	    }
	}
    }
    static class NestedTest19{
	public NestedTest19() {
	    System.out.println("NestedTest19");
	}
	static class NestedNestedTest19{
	    public NestedNestedTest19() {
		System.out.println("NestedNestedTest19");
	    }
	}
    }
}