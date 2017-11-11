package test.menu;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.MenuNavegacionPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

public class cp001ValidarLinkSuperior extends TestBase {
	MenuNavegacionPage menu;
	String pageTitleIndex = "Welcome: Mercury Tours";
	private String lnkSingOn="";
	private String lnkRegister="";
	private String lnkSupport=""; 
	private String lnkContact=""; 

	// Utilidad para el manejo de excel
	static ExcelUtils excelLinksMenu;

	@Test
	public void validarLinkSuperior() {
		// Se crea la instancia para manejar el archivo LinksMenu.xlsx
		try {
			excelLinksMenu = new ExcelUtils("LinksMenu.xlsx", ExcelType.XLSX);
			menu = new MenuNavegacionPage(driver, pageTitleIndex);
			// Validar se encuentren los links con su correspondiente texto
			// SIGN-ON REGISTER SUPPORT CONTACT
			lnkSingOn=excelLinksMenu.getCellData(0, 1);
			if (!(menu.getTextElement(menu.getLnkSingOn(), lnkSingOn))){
				Assert.fail("No se encontró el link " + lnkSingOn);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
