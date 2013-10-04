/**
 * 
 */
package operators;

/**
 * @author Andrew
 *
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(new Dog("spot","Ruff!"));
	System.out.println(new Dog("scruffy","Wurf!"));

    }

}
class Dog
{
    String name;
    String says;
    Dog(String name, String says)
    {
	this.name = name;
	this.says = says;
    }
    public String toString()
    {
	return name + ": " + says;
    }
}
