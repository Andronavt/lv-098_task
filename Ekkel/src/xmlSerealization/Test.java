/**
 * 
 */
package xmlSerealization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author OrestO
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Test")
@XmlType(propOrder = { "pubStr", "i", "privStr", "privStatInt", "I" })
public class Test {
	@XmlElement(required = true)
	public String pubStr;
	@XmlElement(required = true)
	public int pubI;
	@XmlElement(required = true)
	private String privStr;
	@XmlElement(required = true)
	private static int privStatInt;
	@XmlElement(required = true)
	private static final int privStatFinI = 10;
	Test() {

	}
	/**
	 * @return the pubStr
	 */
	public String getPubStr() {
		return pubStr;
	}
	/**
	 * @param pubStr the pubStr to set
	 */
	public void setPubStr(String pubStr) {
		this.pubStr = pubStr;
	}
	/**
	 * @return the pubI
	 */
	public int getPubI() {
		return pubI;
	}
	/**
	 * @param pubI the pubI to set
	 */
	public void setPubI(int pubI) {
		this.pubI = pubI;
	}
	/**
	 * @return the privStr
	 */
	public String getPrivStr() {
		return privStr;
	}
	/**
	 * @param privStr the privStr to set
	 */
	public void setPrivStr(String privStr) {
		this.privStr = privStr;
	}
	/**
	 * @return the privStatInt
	 */
	public static int getPrivStatInt() {
		return privStatInt;
	}
	/**
	 * @param privStatInt the privStatInt to set
	 */
	public static void setPrivStatInt(int privStatInt) {
		Test.privStatInt = privStatInt;
	}
	/**
	 * @return the privstatfini
	 */
	public static int getPrivstatfini() {
		return privStatFinI;
	}	
}