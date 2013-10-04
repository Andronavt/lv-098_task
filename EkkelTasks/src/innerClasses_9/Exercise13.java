/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test13().returnInter().f();

    }

}

interface InterTest13 {
    void f();
}

interface InnerTest13 extends InterTest13 {

}

class Test13 {
    InterTest13 returnInter() {
	public InnerTest13 inner(){
	    return new InnerTest13(){
		public void f(){
		    System.out.println();
		}
	    };
	}
	return inner();
    }
}
