/**
 * 
 */
package com.softserveinc.edu.lms.opearator;

/**
 * @author Maryan
 *
 */
public class Exercise3 {

    static void allisingMetod (DemoFloat df) {
	df.setDemoFloat(2.2f);
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {

	DemoFloat df = new DemoFloat();
	System.out.println("demoFloat = " + df.getDemoFloat());
	allisingMetod(df);
	System.out.println("demoFloat = " + df.getDemoFloat());
	
    }

}

class DemoFloat {
    
    private float demoFloat = 3.14f;

    public float getDemoFloat() {
        return demoFloat;
    }

    public void setDemoFloat(float demoFloat) {
        this.demoFloat = demoFloat;
    }
    
    
    
}
