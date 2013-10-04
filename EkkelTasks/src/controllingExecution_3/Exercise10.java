/**
 * 
 */
package controllingExecution_3;

/**
 * @author Богдан
 * 
 */
public class Exercise10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	for (int i = 1; i < 100; i++) {
	    for (int j = 1; j < 100; j++) {
		if (isInterval(i, j)){
		    if ((isIkol(i, j)) && (isZero(i, j))) {
			System.out.println(i + " * " + j + " = " + i * j);
		    }
		}
	    }

	}

    }

    static boolean isIkol(int i1, int i2) {
	int j = i1 * i2;

	String s1, s2, ss;
	int b1 = 0, b2 = 0;
	s1 = String.valueOf(i1);
	s2 = String.valueOf(i2);
	ss = String.valueOf(j);
	byte[] arb1 = new byte[4];
	arb1[0] = (byte) s1.charAt(0);
	arb1[1] = (byte) s1.charAt(1);
	arb1[2] = (byte) s2.charAt(0);
	arb1[3] = (byte) s2.charAt(1);
	byte[] arb2 = new byte[4];
	arb1[0] = (byte) ss.charAt(0);
	arb1[1] = (byte) ss.charAt(1);
	arb1[2] = (byte) ss.charAt(2);
	arb1[3] = (byte) ss.charAt(3);
	for (byte i : arb1) {
	    b1 = b1 + i;
	}
	for (byte i : arb2) {
	    b2 = b2 + i;
	}
	return (b1 == b2 ? true : false);

    }

    static boolean isZero(int i1, int i2) {
	if ((i1 % 10 != 0) && (i2 % 10 != 0)) {
	    return true;
	} else if (((i1 % 10 == 0) && (i2 % 10 != 0))
		|| ((i1 % 10 != 0) && (i2 % 10 == 0))) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isInterval(int i1, int i2) {
	if ((i1 * i2 > 999) && (i1 + i2 < 10000)) {
	    return true;
	} else {
	    return false;
	}
    }
}
