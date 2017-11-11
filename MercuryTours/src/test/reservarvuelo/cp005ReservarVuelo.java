package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;

public class cp005ReservarVuelo extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";

	@Test
	public void login() {
		
	}

	@Test(priority = 1, dependsOnMethods = { "login" })
	public void diligenciarFindFlight() throws Exception {
		
	}

	@Test(priority = 2, dependsOnMethods = { "login" })
	public void diligenciarSelectFlight() throws Exception {
		
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	public void diligenciarBookFlight() throws Exception {
		
	}
	
	@Test(priority = 4, dependsOnMethods = { "login" })
	public void verificarConfirmationFlight() throws Exception {
		
	}
}
