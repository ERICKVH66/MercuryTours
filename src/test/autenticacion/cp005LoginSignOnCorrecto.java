package test.autenticacion;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;

public class cp005LoginSignOnCorrecto extends TestBase {

	protected LoginPage login;
	protected FindFlightPage findFlight;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	private String pageFindFlight = "Find a Flight: Mercury Tours";
	private String userName="tutorial";
	private String password="tutorial";
	
	
	@Test
	public void loginCorrecto(){
		
	}
}
