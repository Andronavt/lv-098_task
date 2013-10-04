/**
 * 
 */
package interfaces;

/**
 * @author orecto
 *
 */
import iExample.IProcessor;

import static staticPack.StaticPrint.print;

public class Apply {
	public static void process(IProcessor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
}
