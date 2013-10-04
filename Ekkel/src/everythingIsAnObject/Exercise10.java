/**
 * 
 */
package everythingIsAnObject;

/**
 * @author orecto
 *
 */
public class Exercise10 {
    public static void main(String[] args) {
	ArgShow.show(args);
    }
}

class ArgShow{
    public static void show(String[] str){
	for(String temp : str){
	    System.out.println(temp);
	}
    }
}
