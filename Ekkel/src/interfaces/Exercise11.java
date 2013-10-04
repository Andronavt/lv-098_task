/**
 * 
 */
package interfaces;

/**
 * @author orecto
 * 
 */
import iExample.IProcessor;

class SwapString {
	String process(String str) {
		char[] chAr = new char[str.length()];
		if (str.length() % 2 == 0) {
			for (int i = 0; i < str.length(); i += 2) {
				chAr[i] = str.charAt(i + 1);
				chAr[i + 1] = str.charAt(i);
			}
		} else {
			for (int i = 0; i < str.length() - 1; i += 2) {
				chAr[i] = str.charAt(i + 1);
				chAr[i + 1] = str.charAt(i);
			}
			chAr[str.length() - 1] = str.charAt(str.length() - 1);
		}

		return new String(chAr);
	}
}

class SwapStringAdapter implements IProcessor {
	SwapString swapString;

	public SwapStringAdapter(SwapString swapString) {
		this.swapString = swapString;
	}

	public String name() {
		return swapString.getClass().getName();
	}

	public String process(Object input) {
		return swapString.process((String) input);
	}
}

public class Exercise11 {/* FilterProcessor */
	public static void main(String[] args) {
		String str = "OrestO";
		Apply.process(new SwapStringAdapter(new SwapString()), str);
	}
}
/*
 * Create a class with a method that takes a String argument and produces a
 * result that swaps each pair of characters in that argument. Adapt the class
 * so that it works with interfaceprocessor.Apply.process( )
 */
