package ControllingExecution;
//Create a switch statement that prints a message for each case, and put 
//the switch inside a for loop that tries each case. Put a break after each case and test it, 
//then remove the breaks and see what happens. 

/**
 * @author nazarko
 *
 */
public class Ex_8 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ControllingExecution / Ex_8");
		
		for(int i = 0; i < 11; i++) {	
			switch(i) {
				case 0: System.out.println("0"); break;
				case 1: System.out.println("1"); break;
				case 2: System.out.println("2"); break;
				case 3: System.out.println("3"); break;
				case 4: System.out.println("4"); break;
				case 5: System.out.println("5"); break;
				case 6: System.out.println("6"); break;
				case 7: System.out.println("7"); break;
				case 8: System.out.println("8"); break;
				case 9: System.out.println("9"); break;
				default: System.out.println("default");
			}
		}
		
	}
}

