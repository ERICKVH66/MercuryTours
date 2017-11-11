package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los WebElements de http://newtours.demoaut.com/mercurycruise.php
 * @author anamariaquinteroleal
 *
 */
public class CruisePage extends PageBase{

	public CruisePage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}

	@FindBy (how=How.XPATH, using="//img[@alt='Reservations Open']")
	private WebElement lnkNowAccepting;

	public WebElement getLnkNowAccepting() {
		return lnkNowAccepting;
	}
	
	
}
