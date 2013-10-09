package test.ip;

public class IPv4 extends IP {
	public IPv4(String source) {
		super(source);
	}

	public String toString() {
		return this.getIp();
	}
}
