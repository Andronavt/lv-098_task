/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise14 {
	public static void main(String[] args) {
		StatDemo.print();
	}
}

class StatDemo{
	static String str = "Orest";
	static String statStr;
	static{
		statStr = "OrestO";
	}
	
	static void print(){
		System.out.println(str + 1);
		System.out.println(statStr + 3);
	}
}
/*
 * Create a class with a static String field that is initialized at the point of
 * definition, and another one that is initialized by the static block. Add a
 * static method that prints both fields and demonstrates that they are both
 * initialized before they are used
 */
