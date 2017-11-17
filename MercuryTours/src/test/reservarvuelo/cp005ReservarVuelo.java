package test.reservarvuelo;

import org.openqa.selenium.WebElement;
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
/**
 * 
 * @author Elkin Alfonso, Erick Vargas, Sebastian Cardona
 * @version 1.0
 * Universidad del Quindio
 */
public class cp005ReservarVuelo extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	BookFlightPage bookFlightPage;
	FlightConfirmationPage flightConfirmationPage;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";
	String pageTitleBook = "Book a Flight: Mercury Tours";
	String pageTitleConfirmation="Flight Confirmation: Mercury Tours";
	static ExcelUtils excelDatosLogin;
	String userName="";
	String password="";
	String nomBotonSing;

	//Cargamos el excel para los campos de registro de la pagina Book a Flight
	static ExcelUtils excelCamposRegister;
	//Datos para el registro de la pagina Book a Flight
	//Area Passengers
	String firstName="";
	String lastName="";

	//Datos CardType
	String number="";
	String middle="";
	String last;

	@Test
	public void login() {
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
	public void diligenciarFindFlight() throws Exception {
		if(findFlight.isElementPresentAndDisplay(findFlight.getRadioButtonservClass()))
		{
			findFlight.clickButtonLink(findFlight.getRbtnBusiness());
		}
		else
		{
			Assert.fail("No se encontro el radio button");
		}
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		selectFlight = new SelectFlightPage(driver, pageTitleSelect);
	}
	@Test(priority = 2, dependsOnMethods = {"login","diligenciarFindFlight" })
	public void diligenciarSelectFlight() throws Exception
	{
		if(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtonoutFlight()))
		{
			selectFlight.clickButtonLink(selectFlight.getRbtnOutFlight());

		}
		if(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtoninFlight()))
		{
			selectFlight.clickButtonLink(selectFlight.getRbtnInFlight());
		}
		else
		{
			Assert.fail("No se puedo realizar la seleccion");
		}
		selectFlight.clickButtonLink(selectFlight.getBtnContinue());
		bookFlightPage = new BookFlightPage(driver, pageTitleBook);
	}

	@Test(priority = 3, dependsOnMethods = { "login", "diligenciarFindFlight", "diligenciarSelectFlight" })
	public void diligenciarBookFlight() throws Exception 
	{
        excelCamposRegister = new ExcelUtils("CamposRegister.xlsx", ExcelType.XLSX);
     	firstName=excelCamposRegister.getCellData(1, 0);
		lastName=excelCamposRegister.getCellData(1, 1);
		//combomeal
		if(bookFlightPage.isElementPresentAndDisplay(bookFlightPage.getComboMeal()))
		{
			bookFlightPage.clickButtonLink(bookFlightPage.getComboMealBLML());
		}
		//Area cardtype
		number=excelCamposRegister.getCellData(1, 3);
		middle=excelCamposRegister.getCellData(1,4);
		//combo cardtype
		if(bookFlightPage.isElementPresentAndDisplay(bookFlightPage.getComboCardType()))
		{
			bookFlightPage.clickButtonLink(bookFlightPage.getComboCardTypeAX());
		}
		//combos expiracion
		if(bookFlightPage.isElementPresentAndDisplay(bookFlightPage.getComboExpirationMonth()))
		{
			bookFlightPage.clickButtonLink(bookFlightPage.getOption01());
		}
		if(bookFlightPage.isElementPresentAndDisplay(bookFlightPage.getComboExpirationYear()))
		{
			bookFlightPage.clickButtonLink(bookFlightPage.getComboExpirationYear2000());
		}
		bookFlightPage.bookMercuryTours(firstName, lastName,number,firstName,middle,lastName);
		bookFlightPage.clickButtonLink(bookFlightPage.getBtnSecurePurchase());
        flightConfirmationPage=new FlightConfirmationPage(driver, pageTitleConfirmation);
	}

	@Test(priority = 4, dependsOnMethods = { "login", "diligenciarFindFlight", "diligenciarSelectFlight", "diligenciarBookFlight" })
	public void verificarConfirmationFlight() throws Exception
	{
        flightConfirmationPage.clickButtonLink(flightConfirmationPage.getButtonLogOut());
	}
}
