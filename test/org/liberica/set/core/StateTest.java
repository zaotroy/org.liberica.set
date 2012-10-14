package org.liberica.set.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StateTest {
	
	private State state;

	@BeforeMethod
	public void setUp() {
		state = new State();
	}

	@Test
	public void testSayHelloWord() throws Exception {
		// given
		// when
		String result = state.sayHelloWord();
		// then
		assertThat(result, is("Hello world"));
	}

}
