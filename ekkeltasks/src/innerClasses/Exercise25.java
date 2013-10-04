/**
 * 
 */
package innerClasses;

/**
 * @author Andrew
 * 
 */
class Exercise255 extends GreenhouseControls {
    private boolean waterGenStat = false;

    public class WaterMistOn extends Event {
	public WaterMistOn(long delayTime) {
	    super(delayTime);
	}

	public void action() {
	    waterGenStat = true;
	}

	public String toString() {
	    return "Water mist generator on";
	}
    }

    public class WaterMistOff extends Event {
	public WaterMistOff(long delayTime) {
	    super(delayTime);
	}

	public void action() {
	    waterGenStat = false;
	}

	public String toString() {
	    return "Water mist generator off";
	}
    }

}

public class Exercise25 {
    public static void main(String[] args) {
	Exercise255 gc = new Exercise255();
	gc.addEvent(gc.new Bell(900));
	Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200),
		gc.new LightOff(400), gc.new WaterOn(600), gc.new FanOff(400),
		gc.new FanOn(600), gc.new WaterMistOn(400),
		gc.new WaterMistOff(600), gc.new ThermostatDay(1400) };
	gc.addEvent(gc.new Restart(2000, eventList));
	if (args.length == 1)
	    gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
	gc.run();
    }

}