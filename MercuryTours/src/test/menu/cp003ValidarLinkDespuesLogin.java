package test.menu;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.MenuNavegacionPage;

public class cp003ValidarLinkDespuesLogin extends TestBase{
	MenuNavegacionPage menu;
	String pageTitleIndex="Welcome: Mercury Tours";
	
  @Test
  public void validarLinkSingIn() {
	  menu = new MenuNavegacionPage(driver, pageTitleIndex);
	//Validar se encuentren los links con su correspondiente texto
	  //SIGN-OFF 	ITINERARY 	PROFILE 	SUPPORT 	CONTACT
  }
}
