package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.BookFlightPage;
import pageObjects.FindFlightPage;
import pageObjects.FlightConfirmationPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

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
	String pageTitleBook="Book a Flight: Mercury Tours";
	String pageTitleConfirmation="Flight Confirmation: Mercury Tours";
	static ExcelUtils excelDatosLogin;
	String userName="";
	String password="";

	@Test
	public void login() 
	{
		login=new LoginPage(driver, pageTitle);
		try{
			//Se crea la instancia para manejar el archivo DatosLogin.xlsx
			excelDatosLogin= new ExcelUtils("DatosLogin.xlsx",ExcelType.XLSX);
			userName=excelDatosLogin.getCellData(1, 1);
			password=excelDatosLogin.getCellData(1, 2);			
			login=new LoginPage(driver, pageTitle);
			login.loginMercuryTours(userName, password);
			findFlight=new FindFlightPage(driver, pageTitleFind);
		}catch (Exception e) {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}

	@Test(priority = 1, dependsOnMethods = { "login" })
	public void ValidarCamposConfirmationFlight() throws Exception {
		findFlight = new FindFlightPage(driver, pageTitleFind);
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		selectFlight=new SelectFlightPage(driver, pageTitleSelect);
		selectFlight.clickButtonLink(selectFlight.getBtnContinue());
		bookFlight=new BookFlightPage(driver, pageTitleBook);
		//Clic en botón Secure purchase
		bookFlight.clickButtonLink(bookFlight.getBtnSecurePurchase());
		confirmationFlight = new FlightConfirmationPage(driver, pageTitleConfirmation);
		// Validar estén presentes los tres botones
		if(!(confirmationFlight.isElementPresentAndDisplay(confirmationFlight.getButtonBackFlights())))
		{
			Assert.fail("El boton Back flight no fue encontrado");
		}
		if(!(confirmationFlight.isElementPresentAndDisplay(confirmationFlight.getButtonBackHome())))
		{
			Assert.fail("El boton Back Home no fue encontrado");
		}
		if(!(confirmationFlight.isElementPresentAndDisplay(confirmationFlight.getButtonLogOut())))
		{
			Assert.fail("El boton Log Out no fue encontrado");
		}
	}
}
