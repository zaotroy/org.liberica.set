package org.liberica.set.core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*; 
import static org.hamcrest.Matchers.*; 

public class MyClass {

	@Test
	public void when() {
		assertThat("aaa", is(""));
	}

}
