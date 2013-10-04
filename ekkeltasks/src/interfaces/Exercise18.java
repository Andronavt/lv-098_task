/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 * 
 */

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride() {
	System.out.println("Unicycle ride");
    }
}

class UnicycleFactory implements CycleFactory
{
    public Cycle getCycle()
    {
	return new Unicycle();
    }
}

class Bicycle implements Cycle
{
    public void ride()
    {
	System.out.println("Bicycle ride");
    }
}

class BicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle() {
        // TODO Auto-generated method stub
        return new Bicycle();
    }
}

class Tricycle implements Cycle
{
    @Override
    public void ride() {
        // TODO Auto-generated method stub
        System.out.println("Tricycle ride");
    }
}

class TricycleFactory implements CycleFactory
{
    public Cycle getCycle()
    {
	return new Tricycle();
    }
}

class Cycles
{
    public static void rideCycle(CycleFactory cycle)
    {
	Cycle k = cycle.getCycle();
	k.ride();
    }
}

public class Exercise18 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Cycles.rideCycle(new UnicycleFactory());
	Cycles.rideCycle(new BicycleFactory());
	Cycles.rideCycle(new TricycleFactory());

    }

}
