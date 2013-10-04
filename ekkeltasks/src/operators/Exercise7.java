/**
 * 
 */
package operators;

/**
 * @author Andrew
 *
 */
import java.util.Random;

public class Exercise7 {

    public static void main(String[] args) {
	 
        int Heads = 0;
        int Tails = 0;
 
        Random toss = new Random();
 
        //Loop 1 million times
        for (int i=0; i <1000000; i++)
        {
            int side = toss.nextInt(2);
            if(side==0) {
                Heads++;
            }
            else {
                Tails++;
            }
        }
 
        //Display Results
        System.out.println("Number of Heads: " + Heads);
        System.out.print("Number of Tails: " + Tails);
    }
}
