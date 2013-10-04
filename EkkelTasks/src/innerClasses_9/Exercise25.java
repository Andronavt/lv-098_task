/**
 * 
 */
package innerClasses_9;


/**
 * @author Богдан
 * 
 */
public class Exercise25 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	GreenhouseController2.main(args);

    }

}

class GreenhouseControls2 extends GreenhouseControls {
    private boolean waterGenerator = false;

    public class WaterGeneratorOn extends Event {
	public WaterGeneratorOn(long delayTime) {
	    super(delayTime);
	}

	public void action() {
	    // Put hardware control code here.
	    waterGenerator = true;
	}

	public String toString() {
	    return "Greenhouse water generator is on";
	}
    }

    public class WaterGeneratorOff extends Event {
	public WaterGeneratorOff(long delayTime) {
	    super(delayTime);
	}

	public void action() {
	    // Put hardware control code here.
	    waterGenerator = false;
	}

	public String toString() {
	    return "Greenhouse water generator is off";
	}
    }
}

class GreenhouseController2 {
    public static void main(String[] args) {
	GreenhouseControls2 gc = new GreenhouseControls2();
	// Instead of hard-wiring, you could parse
	// configuration information from a text file here:
	gc.addEvent(gc.new Bell(900));
	Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200),
		gc.new LightOff(400), gc.new FanOn(300), gc.new FanOff(200),
		gc.new WaterGeneratorOn(250), gc.new WaterGeneratorOff(100),
		gc.new WaterOn(600), gc.new WaterOff(800),
		gc.new ThermostatDay(1400) };
	gc.addEvent(gc.new Restart(2000, eventList));
	if (args.length == 1)
	    gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
	gc.run();
    }
}
