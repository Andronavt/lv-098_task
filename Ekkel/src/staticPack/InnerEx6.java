/**
 * 
 */
package staticPack;

import iExample.IInnerEx6;

/**
 * @author orecto
 * 
 */
public class InnerEx6 {
	protected class InnerClass implements IInnerEx6 {
		public InnerClass() {

		}

		public String meth() {
			return "InnerClass";
		}
	}
}
