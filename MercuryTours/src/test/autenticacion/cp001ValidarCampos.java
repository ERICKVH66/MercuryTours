package test.autenticacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.LoginPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp001ValidarCampos extends TestBase {

	protected LoginPage login;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	//Utilidad para el manejo de excel
	static ExcelUtils excelCamposLogin;
	private String nomCampoUser="";
	private String nomCampoPass="";
	private String nomBotonSing="";
	@Test
	public void verificarCamposLogin() throws FileNotFoundException, IOException{
		//Se crea la instancia para manejar el archivo CamposLogin.xlsx
		excelCamposLogin= new ExcelUtils("CamposLogin.xlsx",ExcelType.XLSX);
		nomCampoUser = excelCamposLogin.getCellData(1, 0);
		nomCampoPass = excelCamposLogin.getCellData(1, 1);
		nomBotonSing = excelCamposLogin.getCellData(1, 2);
		
//		System.out.println(nomCampoUser + " - " + nomCampoPass + " - "+nomBotonSing);
		
		login=new LoginPage(driver, pageTitleIndex);
		
		if (!(login.isElementPresentAndDisplay(login.getInputUserName()))){
			Assert.fail("No se encontró el campo " + nomCampoUser);
		}
		if (!(login.isElementPresentAndDisplay(login.getInputPassword()))){
			Assert.fail("No se encontró el campo " + nomCampoPass);
		}
		if (!(login.isElementPresentAndDisplay(login.getButtonSingIn()))){
			Assert.fail("No se encontró el botón " + nomBotonSing);
		}
	}
}
