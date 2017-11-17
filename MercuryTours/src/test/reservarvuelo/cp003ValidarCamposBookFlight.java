package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.BookFlightPage;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp003ValidarCamposBookFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	BookFlightPage bookFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";
	String pageTitleBook = "Book a Flight: Mercury Tours";
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
	public void ValidarCamposBookFlight() throws Exception {
		//Se crea la pagina flight finder
		findFlight = new FindFlightPage(driver, pageTitleFind);
		//Se avanza con el boton continue hacia la pagina select flight
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		//Se crea la pagina select flight
		selectFlight=new SelectFlightPage(driver, pageTitleSelect);
		//Se avanza con el boton continue hace book flight
		selectFlight.clickButtonLink(selectFlight.getBtnContinue());
		//Se crea la pagina book flight
		bookFlight = new BookFlightPage(driver, pageTitleBook);
		// Validamos los campos del área Passengers
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputFirstName())))
				{
					Assert.fail("No se encontró el campo para el nombre del pasajero");
				}
						if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputLastName())))
						{
							Assert.fail("No se encontró el campo para el apellido del pasajero");
						}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getComboMeal())))
				{
					Assert.fail("No se encontró el combo de comida");
				}
				// Validamos los campos área Credit Card
						if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getComboCardType())))
						{
							Assert.fail("No se encontró el combo de tipo de tarjeta");
						}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputNumber())))
				{
					Assert.fail("No se encontró el campo para numero de la tarjeta");
				}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getComboExpirationMonth())))
				{
					Assert.fail("No se encontró el combo de mes de expiracion");
				}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getComboExpirationYear())))
				{
					Assert.fail("No se encontró el combo de a�o de expiracion");
				}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputFirstNameCard())))
				{
					Assert.fail("No se encontró el campo para el nombre del propietario de la tarjeta");
				}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputLastNameCard())))
				{
					Assert.fail("No se encontró el campo para el apellido del propietario de la tarjeta");
				}
				if(!(bookFlight.isElementPresentAndDisplay(bookFlight.getInputMiddleNameCard())))
				{
					Assert.fail("No se encontró el campo para middle card");
				}
	}
}
