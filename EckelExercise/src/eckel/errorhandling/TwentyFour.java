package eckel.errorhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

/*
 * add a dispose() method to the FailingConstructor class and write code to preperly use this class.
 */

class FailingConstructor24 {
    private BufferedReader bf;

    public FailingConstructor24(InputStream is) throws Exception {
	try {
	    bf = new BufferedReader(new InputStreamReader(is));
	} catch (Exception e) {
	    try {
		bf.close();
	    } catch (IOException ioe) {
		ioe.printStackTrace();
	    }
	    throw e;
	}
    }

    public String readLine() {
	String s;
	try {
	    s = bf.readLine();
	} catch (IOException e) {
	    throw new RuntimeException("readLine() failed");
	}
	return s;
    }

    public void dispose() {
	try {
	    bf.close();
	    System.out.println("dispose() OK");
	} catch (IOException e) {
	    throw new RuntimeException("bf.close() FAIL!");
	}
    }

}

public class TwentyFour {
    public static void main(String[] args) {
	try {
	    FailingConstructor24 f = new FailingConstructor24(System.in);
	    try {
		String s;
		System.out.println("INput data: ");
		s = f.readLine();
		System.out.println(s);
	    } catch (Exception e) {
		System.out.println("Ex in main()");
		e.printStackTrace();
	    } finally {
		f.dispose();
	    }
	} catch (Exception e) {
	    System.out.println("FAIL FailingConstructor");
	}
    }

}
