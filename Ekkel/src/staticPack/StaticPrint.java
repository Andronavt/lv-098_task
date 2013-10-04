package staticPack;
/**
 * 
 */

/**
 * @author orecto
 *
 */
public class StaticPrint {
	public static void print(String str){
		System.out.println(str);
	}
	public static void print(int i){
		System.out.println(i);
	}
	
	public static void print(Object i){
		System.out.println(i.toString());
	}
}
