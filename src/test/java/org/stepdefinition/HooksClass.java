package org.stepdefinition;

import org.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends Baseclass{
	
	
	@Before
	private void precondition() {
		launchbrowser();
		windowMaximise();

	}
	
	@After
	private void postcondition() {
		closeEntireBrowser();

	}

}
