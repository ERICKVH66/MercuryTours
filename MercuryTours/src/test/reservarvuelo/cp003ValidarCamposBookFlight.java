package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.BookFlightPage;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;

public class cp003ValidarCamposBookFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	BookFlightPage bookFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";

	@Test
	public void login() {
		
	}

	@Test(priority = 1, dependsOnMethods = { "login" })
	public void ValidarCamposBookFlight() throws Exception {
		findFlight = new FindFlightPage(driver, pageTitleFind);
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		selectFlight=new SelectFlightPage(driver, pageTitleSelect);
		selectFlight.clickButtonLink(selectFlight.getBtnContinue());
		// Validar los campos del área 	Passengers y del área Credit Card
		
	}

	
}
