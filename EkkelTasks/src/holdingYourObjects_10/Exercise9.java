/**
 * 
 */
package holdingYourObjects_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Богдан
 *
 */
public class Exercise9 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Sequence2.main(args);

    }

}
interface Selector2 { 
    boolean end(); 
    Object current(); 
    //boolean next(); 
  }   
   
class Sequence2 { 
    private List items; 
    private int next = 0; 
    public Sequence2() { items = new ArrayList(); } 
    public void add(Object x) { 
      items.add(x); 
    } 
    private class SequenceSelector implements Selector2 { 
      
      Iterator<Object> iter = items.iterator();
      public boolean end() { return iter.hasNext(); } 
      public Object current() { return iter.next(); } 
      //public boolean next() {return iter.hasNext() } 
    } 
    public Selector2 selector() { 
      return new SequenceSelector(); 
    }  
    public static void main(String[] args) { 
      Sequence2 sequence = new Sequence2(); 
      for(int i = 0; i < 10; i++) 
        sequence.add(Integer.toString(i)); 
      Selector2 selector = sequence.selector(); 
      while(selector.end()) { 
        System.out.print(selector.current() + " "); 
        //selector.next(); 
      } 
    } 
  }