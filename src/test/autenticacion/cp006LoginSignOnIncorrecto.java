package test.autenticacion;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import pageObjects.MenuNavegacionPage;

public class cp006LoginSignOnIncorrecto extends TestBase {

	protected MenuNavegacionPage menuNavegacon;
	protected LoginPage login;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	private String userName="home";
	private String password="colombia";
	
	
	@Test
	public void loginIncorrecto(){
		
	}
}
