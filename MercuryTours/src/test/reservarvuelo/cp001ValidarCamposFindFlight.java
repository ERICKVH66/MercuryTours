package test.reservarvuelo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.SelectFlightPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

/**
 * @author Elkin Alfonso, Erick Vargas, Sebastian Cardona
 * @version 1.0
 * Universidad del Quindio
 */
public class cp001ValidarCamposFindFlight extends TestBase {
	LoginPage login;
	FindFlightPage findFlight;
	SelectFlightPage selectFlight;
	String pageTitle = "Welcome: Mercury Tours";
	String pageTitleFind = "Find a Flight: Mercury Tours";
	static ExcelUtils excelCamposLogin;
	static ExcelUtils excelDatosLogin;
	String nomCampoUserName="";
	String nomCampoPass="";
	String nomBotonSing;
	@Test
	public void login() throws Exception
	{
		login=new LoginPage(driver, pageTitle);
		try{
			//Se crea la instancia para manejar el archivo DatosLogin.xlsx
			excelDatosLogin= new ExcelUtils("DatosLogin.xlsx",ExcelType.XLSX);
			nomCampoUserName=excelDatosLogin.getCellData(1, 1);
			nomCampoPass=excelDatosLogin.getCellData(1, 2);			
			login=new LoginPage(driver, pageTitle);
			login.loginMercuryTours(nomCampoUserName, nomCampoPass);
			findFlight=new FindFlightPage(driver, pageTitleFind);
		}catch (Exception e) {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test(priority = 1, dependsOnMethods = { "login" })
	public void ValidarCamposFindFlight() throws Exception {
		findFlight = new FindFlightPage(driver, pageTitleFind);
		//Se validan los campos del área Preferences
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getRadioButton())))
		{
			Assert.fail("No se encontró el radio button trypType");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboPassengers())))
		{
			Assert.fail("No se encontró el combo passengers");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboDepartingFrom())))
		{
			Assert.fail("No se encontró el combo departing from ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboOnMonth())))
		{
			Assert.fail("No se encontró el combo on month");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboOnDay())))
		{
			Assert.fail("No se encontró el combo onDay");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboArrivingIn())))
		{
			Assert.fail("No se encontró el combo Arriving in ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboToMonth())))
		{
			Assert.fail("No se encontró el combo ToMonth ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboToDay())))
		{
			Assert.fail("No se encontró el combo toDay ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getRadioButtonservClass())))
		{
			Assert.fail("No se encontró radio button servClass ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getComboAirline())))
		{
			Assert.fail("No se encontró el combo Airline ");
		}
		if(!(findFlight.isElementPresentAndDisplay(findFlight.getBtnContinue())))
		{
			Assert.fail("No se encontró el botón continue");
		}
	}
}