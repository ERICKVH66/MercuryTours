package test.autenticacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.LoginPage;
import pageObjects.MenuNavegacionPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp004ValidarCamposSignOn extends TestBase {

	protected MenuNavegacionPage menuNavegacon;
	protected LoginPage login;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	static ExcelUtils excelCamposLogin;
	private String nomCampoUser="";
	private String nomCampoPass="";
	private String nomBotonSing="";
	
	
	@Test
	public void verificarCamposLogin() throws FileNotFoundException, IOException{
	
	}
	
}
