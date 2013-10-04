/**
 * 
 */
package operators_2;

/**
 * @author Богдан
 * 
 */
public class Exercise5 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Dog dog1 = new Dog("spot", "Ruff!");
	Dog dog2 = new Dog("scruffy", "Wurf!");
	System.out.println("Dog " + dog1.getName() + " says:" + dog1.getSays());
	System.out.println("Dog " + dog2.getName() + " says:" + dog2.getSays());
    }

}

class Dog {
    private String name;
    private String says;

    Dog() {
	name = "no name";
	says = "nothing says";
    }

    Dog(String name, String says) {
	this.name = name;
	this.says = says;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setSays(String says) {
	this.says = says;
    }

    public String getName() {
	return name;
    }

    public String getSays() {
	return says;
    }

}
