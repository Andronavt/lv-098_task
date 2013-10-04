/**
 * 
 */
package innerClasses;


/**
 * @author Andrew
 *
 */
interface ex10
{
    void met(String s);
}

class ex100
{
    public ex10 method(boolean d)
    {
	if(d){
    class Iner implements ex10
    {
	public void met(String s)
	{
	    System.out.println(s);
	    
	}
	
    }
    return new Iner();
	}
	else return null;
    }
    
}
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	ex100 ex = new ex100();
	ex.method(true).met("Its working");
    }
    
    

}
