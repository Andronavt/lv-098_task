package test;

import test.ip.IP;
import test.ip.IPv4;
import test.ip.IPv6;

public class IpFactory {
	public static IP getIP(String str) {
		if (str == null)
			throw new RuntimeException("getIP() get null as parameter");
		else if (str.isEmpty())
			throw new RuntimeException("getIP() get empty parameter");
		else {
			if (str.contains("."))
				return new IPv4(str);
			else if (str.contains(":"))
				return new IPv6(str);
			else
				throw new RuntimeException(
						"getIP() get parameter with unknown format");
		}
	}
}
