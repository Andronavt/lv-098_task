/**
 * 
 */
package ControllingExecution;

import Operators.MyPrint;

/**
 * @author Oleg
 *
 */
public class Example10 {

    static int first(int val)
    {
	return val/1000;
    }
    static int second(int val)
    {
	return (val/100)%10;
    }
    static int third(int val)
    {
	return (val/10)%10;
    }
    static int fourth(int val)
    {
	return val%10;
    }
    static int multipleTwoVal(int a,int b)
    {
	return a*10+b;
    }
    static void ifItIsMult(int a,int b, int c)
    {
	if(a==b*c) System.out.println(a);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
	System.out.println(first(3259));
	System.out.println(second(3259));
	System.out.println(third(3259));
	System.out.println(fourth(3259));
	System.out.println(multipleTwoVal(3, 2));
	for (int i=1000;i<10000;i++)
	{
	    ifItIsMult(i, multipleTwoVal(first(i), second(i)), multipleTwoVal(third(i), fourth(i)));
	    ifItIsMult(i, multipleTwoVal(first(i), second(i)), multipleTwoVal(fourth(i), third(i)));
	    ifItIsMult(i, multipleTwoVal(first(i), third(i)), multipleTwoVal(second(i), fourth(i)));
	    ifItIsMult(i, multipleTwoVal(second(i), third(i)), multipleTwoVal(fourth(i), first(i)));
	    ifItIsMult(i, multipleTwoVal(second(i), fourth(i)), multipleTwoVal(third(i), first(i)));
	    ifItIsMult(i, multipleTwoVal(third(i), first(i)), multipleTwoVal(fourth(i), second(i)));
	    ifItIsMult(i, multipleTwoVal(third(i), second(i)), multipleTwoVal(fourth(i), first(i)));
	    ifItIsMult(i, multipleTwoVal(first(i), third(i)), multipleTwoVal(fourth(i), second(i)));
	    ifItIsMult(i, multipleTwoVal(first(i), fourth(i)), multipleTwoVal(second(i), third(i)));
	    ifItIsMult(i, multipleTwoVal(first(i), fourth(i)), multipleTwoVal(third(i), second(i)));
	    ifItIsMult(i, multipleTwoVal(second(i), first(i)), multipleTwoVal(third(i), fourth(i)));
	    ifItIsMult(i, multipleTwoVal(second(i), first(i)), multipleTwoVal(fourth(i), third(i)));
	    
	}
	
	

    }

}
