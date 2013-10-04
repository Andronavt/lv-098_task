/**
 * 
 */
package InitialisationAndCleanup;

/**
 * @author Oleg
 * 
 */
public class Example19 {

    public static void VarArgMeth(String... args) {
	for (int i = 0; i < args.length; i++) {
	    System.out.println(args[i]);
	}
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	String[] a= new String[10];
	for(int i=0;i<a.length;i++)
	{
	    a[i]=String.valueOf(i);
	}

	VarArgMeth(a);
	VarArgMeth(new String[]{"asas","asas","aaa"});
    }
}
