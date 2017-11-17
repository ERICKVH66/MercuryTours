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
		selectFlight = new SelectFlightPage(driver, pageTitleSelect);
	}
	@Test(priority = 2, dependsOnMethods = {"login","diligenciarFindFlight" })
	public void diligenciarSelectFlight() throws Exception
	{
		if(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtonoutFlight()))
		{
			System.out.println("Valor radio es " +selectFlight.getRbtnOutFlight());
			selectFlight.clickButtonLink(selectFlight.getRbtnOutFlight());
			Thread.sleep(2000);
		}
		if(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtoninFlight()))
		{
			System.out.println("Valor radio es " +selectFlight.getRbtnInFlight());
			selectFlight.clickButtonLink(selectFlight.getRbtnInFlight());
			Thread.sleep(2000);
		}
		else
		{
			Assert.fail("No se puedo realizar la seleccion");
		}
		bookFlightPage = new BookFlightPage(driver, pageTitleBook);
	}

	@Test(priority = 3, dependsOnMethods = { "login", "diligenciarFindFlight", "diligenciarSelectFlight" })
	public void diligenciarBookFlight() throws Exception {

	}

	@Test(priority = 4, dependsOnMethods = { "login" })
	public void verificarConfirmationFlight() throws Exception {

	}
}
