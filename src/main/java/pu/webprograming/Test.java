package pu.webprograming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	public static void main(String[] args) {
		Greeter g = new Greeter();
		System.out.println(g.sayHello("PU"));
		Logger logger = LoggerFactory.getLogger("test");
		logger.info(g.sayHello("PU"));
	}
}
