/**
 * 
 */
package interfaces;

/**
 * @author Andrew
 * 
 */
interface Processor {
    String name();

    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
	System.out.println("Using Processor " + p.name());
	System.out.println(p.process(s));
    }
}

class Test11 implements Processor {

    public Object process(Object input) {
        String k = input.toString();
	char[] k1 = new char[k.length()];
	for (int i = 0; i < k1.length-1; i+=2) {
	    k1[i] = k.charAt(i + 1);
	    k1[i + 1] = k.charAt(i);

	}
	return new String(k1);
    }

    @Override
    public String name() {
	// TODO Auto-generated method stub
	return "proceess";
    }
}

public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Apply.process(new Test11(), "FirstDay");

    }

}
