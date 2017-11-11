package test.registrousuario;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.MenuNavegacionPage;
import pageObjects.RegistrarUsuarioPage;

public class cp002RegistrarUsuarios extends TestBase{
	MenuNavegacionPage menu;
	RegistrarUsuarioPage registrarUsuario;
	String pageTitleIndex="Welcome: Mercury Tours";
	String pageTitleRegistrar="Register: Mercury Tours";
	
	//Este método que tiene solo el @Test, internamente se toma que es el método con prioridad 0
  @Test
  public void ingresarRegistrar() {
	  menu=new MenuNavegacionPage(driver, pageTitleIndex);
	  if(menu.isElementPresentAndDisplay(menu.getLnkRegister())){
		  menu.clickButtonLink(menu.getLnkRegister());
		  registrarUsuario=new RegistrarUsuarioPage(driver, pageTitleRegistrar);
		  assertTrue(registrarUsuario.isPageLoad());
	  }else{
		  Assert.fail("No se encontró en link Register");
	  }
  }
  @Test(priority=1)
  public void realizarRegistro() throws Exception{
	
  }
}
