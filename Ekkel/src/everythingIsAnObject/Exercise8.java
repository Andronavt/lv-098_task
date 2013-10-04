/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 * 
 */
public class Exercise8 {
    public static void main(String[] args) {
	StaticDemo[] sd = new StaticDemo[10];
	for(int i = 0; i < sd.length; i++){
	    sd[i] = new StaticDemo();
	    sd[i].setB(i + 20);
	    sd[i].setI(i);
	}
	
	for(StaticDemo temp : sd){
	    System.out.println("b => " + temp.getB() + "; i => " + temp.getI());
	}
    }
}

class StaticDemo {
    private static int i;
    private int b;

    public int getI() {
	return i;
    }

    public int getB() {
	return b;
    }

    public void setI(int i) {
	this.i = i;
    }

    public void setB(int b) {
	this.b = b;
    }
}
