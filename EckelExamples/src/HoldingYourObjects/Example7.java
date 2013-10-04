/**
 * 
 */
package HoldingYourObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleg
 *
 */
class MyClass{
	public static int count=0;
	private int i= count++;
	public String toString(){
		return String.valueOf(i);
	}
}
public class Example7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 MyClass[] mas= new MyClass[10];
		 List<MyClass> a= new ArrayList<MyClass>();
		 for(int i=0;i<mas.length;i++)
		 {
			 mas[i]= new MyClass();
			 a.add(mas[i]);
		 }
		 System.out.println(a);
		 List<MyClass> sub = a.subList(2, 5);
		 System.out.println(sub);
		 
	}

}
