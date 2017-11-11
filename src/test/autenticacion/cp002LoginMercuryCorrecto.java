package test.autenticacion;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp002LoginMercuryCorrecto extends TestBase {

	protected LoginPage login;
	protected FindFlightPage findFlight;
	//Utilidad para el manejo de excel
	static ExcelUtils excelDatosLogin;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	private String pageFindFlight = "Find a Flight: Mercury Tours";
	private String userName="";
	private String password="";
	
	
	@Test
	public void loginCorrecto(){
		try{
			//Se crea la instancia para manejar el archivo DatosLogin.xlsx
			excelDatosLogin= new ExcelUtils("DatosLogin.xlsx",ExcelType.XLSX);
			userName=excelDatosLogin.getCellData(1, 1);
			password=excelDatosLogin.getCellData(1, 2);
//			System.out.println(userName + "-" + password);
			
			login=new LoginPage(driver, pageTitleIndex);
			login.loginMercuryTours(userName, password);
			findFlight=new FindFlightPage(driver, pageFindFlight);
		}catch (Exception e) {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
}
