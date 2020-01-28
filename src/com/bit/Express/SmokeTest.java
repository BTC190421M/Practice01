package com.bit.Express;

import org.junit.Test;

public class SmokeTest extends BaseClass {

	Scenario s;

	@Test
	public void testForExpess() throws InterruptedException {
		s = new Scenario(dr);
		s.expressTest();
	}

}
