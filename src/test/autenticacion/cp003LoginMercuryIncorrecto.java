package test.autenticacion;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.LoginPage;
import pageObjects.MenuNavegacionPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp003LoginMercuryIncorrecto extends TestBase {

	protected MenuNavegacionPage menuNavegacon;
	protected LoginPage login;
	//Utilidad para el manejo de excel
	static ExcelUtils excelDatosLogin;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	private String userName="";
	private String password="";
	
	@Test
	public void loginIncorrecto(){
		try{
			//Se crea la instancia para manejar el archivo DatosLogin.xlsx
			excelDatosLogin= new ExcelUtils("DatosLogin.xlsx",ExcelType.XLSX);
			userName=excelDatosLogin.getCellData(2, 1);
			password=excelDatosLogin.getCellData(2, 2);
//			System.out.println(userName + "-" + password);
			login=new LoginPage(driver, pageTitleIndex);
			login.loginMercuryTours(userName, password);
			
			Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
		}catch (Exception e) {
			Assert.fail(e.getMessage());
			e.printStackTrace();
		}
	}
}
