/**
 * 
 */
package operators;

/**
 * @author Andrew
 * 
 */
class FloatD {
    float a;

    public void setFloat(float a) {
	this.a = a;
    }

    public float getFloat() {
	return a;
    }
}
public class Exercise2 {
    public static void main(String[] args) {
	FloatD floatd = new FloatD();
	floatd.a = 3.45f;
	System.out.println(floatd.a);
    }
}


