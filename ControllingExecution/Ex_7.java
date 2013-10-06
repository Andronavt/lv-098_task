package ControllingExecution;

//Modify exercise 1 so that the program exits by using the break keyword at
//value 99. Try using return instead. 
/**
 * @author nazarko
 * 
 */
public class Ex_7 {
	public static class Test {
		static void T_1(int n) {
			for (int i = 90; i < n; i++)
				System.out.println(i + 1);
		}

		static void T_2(int n) {
			for (int i = 90; i < n; i++) {
				System.out.println(i + 1);
				if (i == 99){
					System.out.println("break");
					break;
				}
			}
		}

		static void T_3(int n) {
			for (int i = 90; i < n; i++) {
				System.out.println(i + 1);
				if (i == 99)
					return;
			}
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("ControllingExecution / Ex_7");

			T_1(100);
			T_2(100);
			T_3(100);
		}
	}
}
