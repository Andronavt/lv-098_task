package eckel.polymorphism;

class AlertStatus {
    public void status() {
    }
}

class RedStatus extends AlertStatus {
    public void status() {
	System.out.println("Red status");
    }
}

class BlueStatus extends AlertStatus {
    public void status() {
	System.out.println("Blue status");
    }
}

class GreenStatus extends AlertStatus {
    public void status() {
	System.out.println("Green status");
    }
}

class Lamp {
    public void change(AlertStatus alertStatus) {
	alertStatus.status();
    }

    public void currentStatus() {
	new GreenStatus().status();
    }
}

public class Starship {

    public static void main(String[] args) {
	Lamp lamp = new Lamp();
	lamp.currentStatus();
	lamp.change(new RedStatus());
    }

}
