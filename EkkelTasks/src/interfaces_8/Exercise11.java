/**
 * 
 */
package interfaces_8;

import java.util.Arrays;

/**
 * @author Богдан
 * 
 */
public class Exercise11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String in;
	in = "123456";
	Test10 t = new Test10();
	Apply ap = new Apply();
	System.out.println("Input string is:" + in);
	ap.process(t, in);

    }

}

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

class Test10 implements Processor {
    @Override
    public String name() {
	//System.out.println("Test10");
	return "Test10";
    }

    @Override
    public Object process(Object input) {
	
	return swap((String) input);
    }

    private String  swap(String s) {
	char[] ch = s.toCharArray();
	char tmp;
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < ch.length - 1; i += 2) {
	    tmp = ch[i];
	    ch[i] = ch[i + 1];
	    ch[i + 1] = tmp;
	}
	sb.append("Result of swap is: ");
	for (char c : ch) {
	    sb.append(c);
	}
	return sb.toString();
    }
}
