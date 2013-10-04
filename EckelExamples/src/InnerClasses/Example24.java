/**
 * 
 */
package InnerClasses;

/**
 * @author Oleg
 *
 */
public class Example24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GreenhouseControls24 gc = new GreenhouseControls24();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new FanOn(300),
			gc.new LightOff(400),
			gc.new FanOff(500),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400),
			gc.new WaterMistOn(200),
			gc.new WaterMistOn(300)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
				new GreenhouseControls24.Terminate(
					new Integer(args[0])));
		gc.run();
	}

}
