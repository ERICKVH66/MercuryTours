package test.reservarvuelo;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp002ValidarCamposSelectFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	String pageTitleSelect = "Select a Flight: Mercury Tours";
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
	public void ValidarCamposSelectFlight() throws Exception {
		//Se crea la pagina flight finder
		findFlight = new FindFlightPage(driver, pageTitleFind);
		//Ubicamos el boton continue en la pagina flight finder y se da click para pasar a la pagina select flight
		findFlight.clickButtonLink(findFlight.getBtnContinue());
		//Validar que se encuentre en la página Select a Flight: Mercury Tours
		selectFlight = new SelectFlightPage(driver, pageTitleSelect);
	    //Se validan los campos de la pagina
		if(!(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtonoutFlight())))
		{
			Assert.fail("No se encontró el radio button Depart");
		}
		if(!(selectFlight.isElementPresentAndDisplay(selectFlight.getRadioButtoninFlight())))
		{
			Assert.fail("No se encontró el radio button Return");
		}
	}
}
