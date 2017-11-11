package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los WebElements de http://newtours.demoaut.com/mercuryreservation.php
 * @author anamariaquinteroleal
 *
 */
public class FindFlightPage extends PageBase {

	public FindFlightPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}

	// WebElements Flight Details

	/**
	 * Área Flight Details
	 */
	// RadioButtons Individuales
	@FindBy(how = How.CSS, using = "[name='tripType'][value*='roundtrip']")
	private WebElement rbtnRoundTrip;
	@FindBy(how = How.XPATH, using = "//input[@name='tripType'][contains(@value,'oneway')]")
	private WebElement rbtnOneWay;
	// WebElement radio button trip type
	@FindBy(how = How.NAME, using = "tripType")
	private WebElement radioButton;
	@FindBy(how = How.NAME, using = "tripType")
	private List<WebElement> radioButtonOptions;

	@FindBy(how = How.NAME, using = "passCount")
	private WebElement comboPassengers;
	@FindBy(how = How.NAME, using = "fromPort")
	private WebElement comboDepartingFrom;
	@FindBy(how = How.NAME, using = "fromMonth")
	private WebElement comboOnMonth;
	@FindBy(how = How.NAME, using = "fromDay")
	private WebElement comboOnDay;
	@FindBy(how = How.NAME, using = "toPort")
	private WebElement comboArrivingIn;
	@FindBy(how = How.NAME, using = "toMonth")
	private WebElement comboToMonth;
	@FindBy(how = How.NAME, using = "toDay")
	private WebElement comboToDay;

	/**
	 * Área Preferences
	 */
	// WebElement radio button Service Class
	@FindBy(how = How.NAME, using = "servClass")
	private WebElement radioButtonservClass;
	@FindBy(how = How.NAME, using = "servClass")
	private List<WebElement> radioButtonservClassOptions;
	
	@FindBy(how = How.NAME, using = "airline")
	private WebElement comboAirline;
	
	//Botón Continue
	@FindBy(how = How.NAME, using = "findFlights")
	private WebElement btnContinue;

	
	/**
	 * Getters
	 */
	
	public WebElement getRbtnRoundTrip() {
		return rbtnRoundTrip;
	}
	public WebElement getRbtnOneWay() {
		return rbtnOneWay;
	}
	public List<WebElement> getRadioButtonOptions() {
		return radioButtonOptions;
	}
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getComboPassengers() {
		return comboPassengers;
	}
	public WebElement getComboDepartingFrom() {
		return comboDepartingFrom;
	}
	public WebElement getComboOnMonth() {
		return comboOnMonth;
	}
	public WebElement getComboOnDay() {
		return comboOnDay;
	}
	public WebElement getComboArrivingIn() {
		return comboArrivingIn;
	}
	public WebElement getComboToMonth() {
		return comboToMonth;
	}
	public WebElement getComboToDay() {
		return comboToDay;
	}
	public WebElement getRadioButtonservClass() {
		return radioButtonservClass;
	}
	public List<WebElement> getRadioButtonservClassOptions() {
		return radioButtonservClassOptions;
	}
	public WebElement getComboAirline() {
		return comboAirline;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}

	
	
}
