/**
 * 
 */
package initializationCleanup;

/**
 * @author orecto
 * 
 */
public class Exercise16 {
	public static void main(String[] args) {
		StrArr sa = new StrArr(5);
	}
}

class StrArr {
	StrArr(int size) {
		String[] str = new String[size];
		for(int i = 'a'; i < size + 97; i++){
			str[i - 97] = new String("add => " + i);
		}
		
		for(String temp : str){
			System.out.println(temp);
		}
	}
}

/*
 * Create an array of String objects and assign a String to each element. Print
 * the array by using a for loop
 */