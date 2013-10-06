/**
 * 
 */
package com.softserveinc.edu.lms.polymorphism;

/**
 * @author Maryan
 * Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 *
 */

class AlertStatus {
    public void alert() {
	System.out.println("Alert");
    }
}

class AlertType1 extends AlertStatus {

    @Override
    public void alert() {
	System.out.println("AlertType1");
    }
}

class AlertType2 extends AlertStatus {
    
    @Override
    public void alert() {
	System.out.println("AlertType2");
    }
}

class AlertType3 extends AlertStatus {
    
    @Override
    public void alert() {
	System.out.println("AlertType3");
    }
}


class Starship {
    
    private AlertStatus alertStatus;

    public void alertType1() {
	alertStatus = new AlertType1();
	alertStatus.alert();
    }
    
    public void alertType2() {
   	alertStatus = new AlertType2();
   	alertStatus.alert();
    }
    
    public void alertType3() {
   	alertStatus = new AlertType3();
   	alertStatus.alert();
    }
    
    public void changeAlertType(int type){
	switch (type) {
	case 1:
	   alertType1();
	    break;
	case 2:
	    alertType2();
	    break;
	case 3:
	    alertType3();
	    break;
	default:
	    break;
	}
    }
}

public class Exercise16 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Starship starShip = new Starship();
	for (int i=0; i<4; i++) {
	    starShip.changeAlertType(i);
	}
    }
}