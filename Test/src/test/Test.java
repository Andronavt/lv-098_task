package test;

import java.util.Date;

import test.parser.Parser;

public class Test {
	public static void main(String[] args) {
		Date start = null;
		Date end = null;
		long count = 0;
		String path = "";
		int avrg = 0;
		int n = 1000;
		for (int j = 0; j < n; j++) {
			count = 0;
			for (int i = 1; i < 4; i++) {
				path = "C:\\Users\\orecto\\Desktop\\res" + i + ".txt";
				start = new Date();
				Parser p = ParserFactory.getParser(path);
				end = new Date();
//				System.out.println(path);
//				System.out.println("IPv4: " + p.getListIPv4().size());
//				System.out.println("IPv6: " + p.getListIPv6().size());
//				System.out.println("duration BufferedReader(FileReader)"
//						+ (end.getTime() - start.getTime()) + " ms\n");
				count += end.getTime() - start.getTime();
			}
//			System.out.println("Total time: " + count + " ms.");
			avrg += count;
		}
		System.out.println("Sum total duration: " + avrg + "ms. " + (avrg/1000.0) + "sec.");
		System.out.println("Average duration: " + ((float)avrg/n) + "ms.");

	}
}
