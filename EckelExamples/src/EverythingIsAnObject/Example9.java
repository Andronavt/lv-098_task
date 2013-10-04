/**
 * 
 */
package EverythingIsAnObject;

/**
 * @author Oleg
 * 
 */
public class Example9 {
    public static void main(String[] args) {
	/**
	 * Integer provement
	 */
	Integer intOb = new Integer(10);
	System.out.println(intOb);
	int intPrim = intOb;
	System.out.println(intPrim);
	intOb = intPrim;
	System.out.println(intOb);
	/**
	 * Double provement
	 */
	Double doubOb = new Double(1.2);
	System.out.println(doubOb);
	double doubPrim = doubOb;
	System.out.println(doubPrim);
	doubOb = doubPrim;
	System.out.println(doubPrim);
	/**
	 * Byte provement
	 */
	Byte byteOb = new Byte("2");
	System.out.println(byteOb);
	byte bytePrim = byteOb;
	System.out.println(bytePrim);
	byteOb =  bytePrim;
	System.out.println(byteOb);

	/**
	 * Char provement
	 */
	Character charOb = new Character('a');
	System.out.println(charOb);
	char charPrim = charOb;
	System.out.println(charPrim);
	charOb = charPrim;
	System.out.println(charOb);
	/**
	 * Short provement
	 */
	Short shortOb = new Short("3");
	System.out.println(shortOb);
	short shortPrim = shortOb;
	System.out.println(shortPrim);
	shortOb = shortPrim;
	System.out.println(shortOb);
	/**
	 * Float provement
	 */
	Float floatOb= new Float(2.6);
	System.out.println(floatOb);
	float floatPrim = floatOb;
	System.out.println(floatPrim);
	floatOb= floatPrim;
	System.out.println(floatOb);
	/**
	 * Boolean provement
	 */
	Boolean boolOb = new Boolean(true);
	System.out.println(boolOb);
	boolean boolPrim = boolOb;
	System.out.println(boolPrim);
	boolOb=boolPrim;
	System.out.println(boolOb);
	/**
	 * Long provement
	 */
	Long longOb= new Long(100);
	System.out.println(longOb);
	long longPrim = longOb;
	System.out.println(longPrim);
	longOb= longPrim;
	System.out.println(longOb);
	
	
    }

}
