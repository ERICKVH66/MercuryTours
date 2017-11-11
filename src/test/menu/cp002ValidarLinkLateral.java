package test.menu;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.MenuNavegacionPage;

public class cp002ValidarLinkLateral extends TestBase{
	MenuNavegacionPage menu;
	String pageTitleIndex="Welcome: Mercury Tours";
	
  @Test
  public void validarLinkLateral() {
	  menu = new MenuNavegacionPage(driver, pageTitleIndex);
	  //Validar se encuentren los links con su correspondiente texto
	  // Home			Flights				Hotels				Car Rentals
	  // Cruises		Destinations		Vacations
  }
}
