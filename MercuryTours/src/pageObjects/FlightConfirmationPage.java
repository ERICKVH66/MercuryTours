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
	@FindBy(how=How.LINK_TEXT, using="SIGN-OFF")
	private WebElement buttonBackFlights;
	@FindBy(how=How.LINK_TEXT, using="SIGN-OFF")
	private WebElement buttonBackHome;
	@FindBy(how=How.LINK_TEXT, using="SIGN-OFF")
	private WebElement buttonLogOut;
	/**
	 * Metodo que me obtiene el/la  buttonBackFlights
	 * @return  buttonBackFlights
	 */
	public WebElement getButtonBackFlights() {
		return buttonBackFlights;
	}
	/**
	 * Metodo que me obtiene el/la  buttonBackHome
	 * @return  buttonBackHome
	 */
	public WebElement getButtonBackHome() {
		return buttonBackHome;
	}
	/**
	 * Metodo que me obtiene el/la  buttonLogOut
	 * @return  buttonLogOut
	 */
	public WebElement getButtonLogOut() {
		return buttonLogOut;
	}
	
	
}
