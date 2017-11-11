package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.BookFlightPage;
import pageObjects.FindFlightPage;
import pageObjects.FlightConfirmationPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;

public class cp004ValidarCamposConfirmationFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	BookFlightPage bookFlight;
	FlightConfirmationPage confirmationFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";
	//Completar
	String pageTitleBook="";
	String pageTitleConfirmation="";

	@Test
	public void login() {
	
	}

	@Test(priority = 1, dependsOnMethods = { "login" })
	public void ValidarCamposConfirmationFlight() throws Exception {
		findFlight = new FindFlightPage(driver, pageTitleFind);
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		selectFlight=new SelectFlightPage(driver, pageTitleSelect);
		selectFlight.clickButtonLink(selectFlight.getBtnContinue());
		bookFlight=new BookFlightPage(driver, pageTitleBook);
		//Clic en botón Secure purchase
		// Validar estén presentes los tres botones
	}
}
