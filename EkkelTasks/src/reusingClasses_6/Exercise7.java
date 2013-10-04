/**
 * 
 */
package reusingClasses_6;

/**
 * @author Богдан
 *
 */
public class Exercise7 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	new CC(3);

    }

}
class AA{
    AA(int i){
	System.out.println("Create AA with i = "+i);
    }
}
class BB{
    BB(int i){
	System.out.println("Create BB with i = "+ i);
    }
}
class CC extends AA{
    int i;
    CC(int i){
	super(i);
	this.i = i;
	System.out.println("Create CC with i = "+i);
    }
    BB obj = new BB(i);
}
