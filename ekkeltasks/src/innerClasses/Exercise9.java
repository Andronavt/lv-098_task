/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 *
 */
interface ex9
{
    ex9 met(String s);
}

class ex99
{
    ex9 method(){
    class Iner implements ex9
    {
	public ex9 met(String s)
	{
	    System.out.println("My name is" + s);
	    return new Iner();
	}
	
    }
    return new Iner();
    }
}
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
        ex99 k = new ex99();
        k.method().met("Andriy");
    }

}
