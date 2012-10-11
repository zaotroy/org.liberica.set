package org.liberica.set.core;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MachineTest {

	private Machine machine;

	@BeforeMethod
	public void setUp() {
		machine = new Machine();
	}

	@Test
	public void whenSayHelloThenReturnCorrectString() {
		// given
		// when
		String result = machine.sayHello();
		// then
		Assert.assertEquals(result, "Hello world");
	}
}
