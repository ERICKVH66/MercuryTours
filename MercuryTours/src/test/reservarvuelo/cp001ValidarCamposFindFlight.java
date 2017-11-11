package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;

public class cp001ValidarCamposFindFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";

	@Test
	public void login() {
	
	}

	@Test(priority = 1, dependsOnMethods = { "login" })
	public void ValidarCamposFindFlight() throws Exception {
		findFlight = new FindFlightPage(driver, pageTitleFind);
		//Validar los campos del área Preferences
	}

}