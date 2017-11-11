package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los webElements de http://newtours.demoaut.com/mercurypurchase2.php
 * @author anamariaquinteroleal
 *
 */
public class FlightConfirmationPage extends PageBase{

	public FlightConfirmationPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}
	
	//Botones
	@FindBy(how=How.CSS, using="")
	private WebElement buttonBackFlights;
	@FindBy(how=How.XPATH, using="")
	private WebElement buttonBackHome;
	@FindBy(how=How.CSS, using="")
	private WebElement buttonLogOut;
	
}
