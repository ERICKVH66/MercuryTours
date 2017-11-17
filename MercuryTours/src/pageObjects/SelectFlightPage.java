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

	//Ã�rea DEPART
	@FindBy(how = How.NAME, using = "outFlight")
	private WebElement radioButtonoutFlight;
	@FindBy(how = How.NAME, using = "outFlight")
	private List<WebElement> radioButtonoutFlightOptions;
	@FindBy(how = How.XPATH, using = "//input[@name='outFlight'][contains(@value, 'Pangea Airlines$362$274$9:17')]")
	private WebElement rbtnOutFlight;
	/**
	 * Metodo que me obtiene el/la  rbtnOutFlight
	 * @return  rbtnOutFlight
	 */
	public WebElement getRbtnOutFlight() {
		return rbtnOutFlight;
	}

	//Ã�rea RETURN
	@FindBy(how = How.NAME, using = "inFlight")
	private WebElement radioButtoninFlight;
	@FindBy(how = How.NAME, using = "inFlight")
	private List<WebElement> radioButtoninFlightOptions;
    @FindBy(how = How.XPATH,using="//input[@name='inFlight'][contains(@value,'Blue Skies Airlines$631$273$14:30')]")
	private WebElement rbtbInFlight;
	@FindBy(how = How.NAME, using = "reserveFlights")
	private WebElement btnContinue;
    public WebElement getRbtnInFlight() {
    	return rbtbInFlight;
    }
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
