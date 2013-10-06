//Modify the two test() methods in the previous two programs so that they take
//two extra arguments, begin and end, and so that testval is tested to see if it
//is within the range between (and including) begin and end.
package ControllingExecution;

/**
 * @author nazarko
 *
 */
public class Ex_6 {
	static int test(int value, int begin, int end) {
		if(end < begin) {
			System.out.println("error");
			return 0;
		} 
		if((value > (begin - 1)) && (value < (end + 1))) 
			return +1;
		if((value < begin) || (value > end))
			return -1;
		return 0;
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_6");
		System.out.println(test(1, 3, 2));
		System.out.println(test(2, 1, 3));
		System.out.println(test(3, 3, 4));
		System.out.println(test(4, 1, 3));	
		System.out.println(test(5, 5, 5));	
	}
}