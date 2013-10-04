/**
 * 
 */
package polymorphism;

/**
 * @author Andrew
 * 
 */

class AlertStatus
{
    public void alert()
    {
	System.out.println("Alert status");
    }
}

class AlertStatusN extends AlertStatus
{
    public void alert()
    {
	System.out.println("Alert statuc is normal");
    }
}

class AlertStatusH extends AlertStatus
{
    public void alert()
    {
	System.out.println("Alert status is high");
    }
}
class AlertStatusM extends AlertStatus
{
    public void alert()
    {
	System.out.println("Alert status  is minimum");
    }
}


class StartShip {
    AlertStatus status = new AlertStatusM();
    public void changeToMinimum()
    {
	status = new AlertStatusM();
    }
    public void changeToHigh()
    {
	status = new AlertStatusH();
    }
    public void changeToNormal()
    {
	status = new AlertStatusN();
    }
    void printStatus()
    {
	status.alert();
    }

    }

public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	StartShip startShip = new StartShip();
	startShip.printStatus();
	startShip.changeToHigh();
	startShip.printStatus();
	startShip.changeToNormal();
	startShip.printStatus();
	startShip.changeToMinimum();
	startShip.printStatus();

    }

}
