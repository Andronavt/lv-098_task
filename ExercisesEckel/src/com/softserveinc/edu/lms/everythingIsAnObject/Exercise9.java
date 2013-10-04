/**
 * 
 */
package com.softserveinc.edu.lms.everythingIsAnObject;


/**
 * @author Maryan
 *
 */
public class Exercise9 {
    byte byteDemonstrate = 1;    
    short shortDemonstrate =2;
    int intDemonstrate = 3;
    long longDemonstrate= 4;
    double doubleDemonstrate = 3.14;
    float floatDemonstrate = (float) 6.28;
    char charDemonstrate = 'A';
    
    Byte byteWraper = 1;
    Short shortWraper = 2;
    Integer intWraper = 3;
    Long longWraper = (long) 4;
    Double doubleWraper = 3.14;
    Float floatWraper = (float) 3.6;
    Character charWraper = 'B';
    
    byte byteResultOfAutoboxing;
    short shortResultOfAutoboxing; 
    int intResultOfAutoboxing;
    long longResultOfAutoboxing;
    double doubleResultOfAutoboxing;
    float floatResultOfAutoboxing;
    char charResultOfAutoboxing;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
	Exercise9 ex = new Exercise9();
	ex.showAutoboxing();
	
    }
    
    public void autoboxing () {
	byteResultOfAutoboxing = (byte) (byteDemonstrate + byteWraper);
	shortResultOfAutoboxing = (short) (shortDemonstrate + shortWraper);
	intResultOfAutoboxing = intDemonstrate + intWraper;
	longResultOfAutoboxing = longDemonstrate + longWraper;
	doubleResultOfAutoboxing = doubleDemonstrate + doubleWraper;
	floatResultOfAutoboxing = floatDemonstrate + floatWraper;
	charResultOfAutoboxing = (char) (charDemonstrate + charWraper);
    }
    
    public void showAutoboxing () {
	System.out.println("autoboxing byte and Byte = " + byteResultOfAutoboxing);
	System.out.println("autoboxing short and Short = " + shortResultOfAutoboxing);
	System.out.println("autoboxing int and Integer = " + intResultOfAutoboxing);
	System.out.println("autoboxing long and Long = " + longResultOfAutoboxing);
	System.out.println("autoboxing double and Double = " + doubleResultOfAutoboxing);
	System.out.println("autoboxing float and Float = " + floatResultOfAutoboxing);
	System.out.println("autoboxing char and Character = " + charResultOfAutoboxing);
    }

}
