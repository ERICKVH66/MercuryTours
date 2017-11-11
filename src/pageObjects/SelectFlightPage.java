package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los WebElements de http://newtours.demoaut.com/mercuryreservation2.php
 * @author anamariaquinteroleal
 *
 */
public class SelectFlightPage extends PageBase{

	public SelectFlightPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}
	
	//WebElements Select Flights
	
	//Área DEPART
	@FindBy(how = How.NAME, using = "")
	private WebElement radioButtonoutFlight;
	@FindBy(how = How.NAME, using = "")
	private List<WebElement> radioButtonoutFlightOptions;

	//Área RETURN
	@FindBy(how = How.NAME, using = "")
	private WebElement radioButtoninFlight;
	@FindBy(how = How.NAME, using = "")
	private List<WebElement> radioButtoninFlightOptions;
	
	@FindBy(how = How.NAME, using = "")
	private WebElement btnContinue;

	public WebElement getRadioButtonoutFlight() {
		return radioButtonoutFlight;
	}
	public List<WebElement> getRadioButtonoutFlightOptions() {
		return radioButtonoutFlightOptions;
	}
	public WebElement getRadioButtoninFlight() {
		return radioButtoninFlight;
	}
	public List<WebElement> getRadioButtoninFlightOptions() {
		return radioButtoninFlightOptions;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
