package org.liberica.set.core;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

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
		assertThat(result, is("Hello world"));
	}
}
