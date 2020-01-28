package com.bit.Target;

import org.junit.Test;

public class SmokeTest extends BaseClass{

	Scenario s;
	
	
	@Test
	public void targetTest() throws InterruptedException {
		s= new Scenario (dr);
		s.targetLogIn();
	}
	
	
	
	
}
