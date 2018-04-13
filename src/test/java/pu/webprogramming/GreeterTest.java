package pu.webprogramming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import pu.webprograming.Greeter;

public class GreeterTest {

	@Test
	public void test() {
		Greeter g = new Greeter();
		String greeting = g.sayHello("PU");
		assertThat(greeting, equalTo("Hi, PU"));
	}

}
