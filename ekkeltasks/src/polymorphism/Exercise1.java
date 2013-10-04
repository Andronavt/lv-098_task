/**
 * 
 */
package polymorphism;

/**
 * @author Andrew
 *
 */
// Звичайні коментарі виділяє по-іншому ніж ті, що на документацію

public class Exercise1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
       Cycle unicycle = new Unicycle();
       Cycle bicycle = new Bicycle();
       Cycle tricycle = new Tricycle();
       unicycle.run();
       bicycle.run();
       tricycle.run();
    }

}
class Cycle
{
    int number = 0;
    public void run()
    {
	System.out.println("run");
    }
    public int wheels()
    {
	
	return this.number;
    }
}
class Unicycle extends Cycle
{
    private int number = 1;
    public void run()
    {
	System.out.println("Ryn Unicycle");
	System.out.println(wheels());
    }
    public int wheels()
    {
	
	return this.number;
    }
    public void balance()
    {
	System.out.println("Balance Unicycle");
    }
}
class Bicycle extends Cycle
{
    int number = 2;
    public void run()
    {
	System.out.println("Run Bicycle");
	System.out.println(wheels());
    }
    public int wheels()
    {
	
	return this.number;
    }
    public void balance()
    {
	System.out.println("Balance TryCycle");
    }
}
class Tricycle extends Cycle
{
    int number = 3;
    public void run()
    {
	System.out.println("Run Tricycle");
	System.out.println(wheels());
    }
    public int wheels()
    {
	
	return this.number;
    }
}