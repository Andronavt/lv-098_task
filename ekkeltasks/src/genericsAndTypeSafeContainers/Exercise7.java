/**
 * 
 */
package genericsAndTypeSafeContainers;
import java.util.Random;
import java.util.ArrayList;
/**
 * @author Andrew
 *
 */
/* Create a class, then make an initialized array of objects of your class
* Fill a List from your array. Create a subset of your List by using 
* subList(), then remove this subset from your List.
*/
class A17
{
  public static int count = 0;
  private int id;
  A17()
  {
      this.id = count;
      count++;
  }
  public String toString()
  {
      return "Element" + this.id;
  }

}
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
         A17[] array = new A17[10];
         ArrayList<A17> list = new ArrayList<A17>();
         for (A17 a17 : array) {
	    a17 = new A17();
	    list.add(a17);
	}
         System.out.println(list);
        ArrayList<A17> subset = new ArrayList<A17>(list.subList(1, 3));
        System.out.println(subset);
        list.removeAll(subset);
        System.out.println(list);
         
    }

}
