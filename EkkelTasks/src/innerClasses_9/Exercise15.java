/**
 * 
 */
package innerClasses_9;

/**
 * @author Богдан
 * 
 */
public class Exercise15 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new Test15_2().inner().create();

    }

}

interface InnerTest15 {
    Test15 create();
}

class Test15 implements InnerTest15 {
    Test15() {
	System.out.println("Create Test15");
    }

    Test15(String s) {
	System.out.println("Creat Test15 with arg:" + s);
    }

    @Override
    public Test15 create() {
	return null;
    }
}

class Test15_2 {
    Test15 retTest() {
	return new Test15();
    }

    InnerTest15 inner() {
	return new InnerTest15() {
	    @Override
	    public Test15 create() {
		return new Test15();
	    }
	};
    }
}
