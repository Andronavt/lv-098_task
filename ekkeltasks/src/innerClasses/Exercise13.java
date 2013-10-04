/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
interface ex13
{
    void met(String s);
}

class ex133
{
    ex13 method(){
    return new ex13(){
	public void met(String s)
	{
	    System.out.println("My name is " + s);
	}
	
    };
    }
}
public class Exercise13 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
         ex133 k = new ex133();
         ex13 d = k.method();
         d.met("Andriy");
    }

}
