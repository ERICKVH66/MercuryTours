package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;
public class BookFlightPage extends PageBase{

	/**
	 * Clase que contiene los webElements de http://newtours.demoaut.com/mercurypurchase.php
	 * @param driver
	 * @param pageTitle
	 */
	public BookFlightPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}
	
	//Área Passenger
	@FindBy(how=How.NAME, using="")
	private WebElement inputFirstName;
	@FindBy(how=How.NAME, using="")
	private WebElement inputLastName;
	@FindBy(how=How.NAME, using="")
	private WebElement comboMeal;
	
	//Área Credit Card
	@FindBy(how=How.NAME, using="")
	private WebElement comboCardType;
	@FindBy(how=How.NAME, using="")
	private WebElement inputNumber;
	@FindBy(how=How.NAME, using="")
	private WebElement comboExpirationMonth;
	@FindBy(how=How.NAME, using="")
	private WebElement comboExpirationYear;
	@FindBy(how=How.NAME, using="")
	private WebElement inputFirstNameCard;
	@FindBy(how=How.NAME, using="")
	private WebElement inputMiddleNameCard;
	@FindBy(how=How.NAME, using="")
	private WebElement inputLastNameCard;
	
	//Área Billing Address
	@FindBy(how=How.NAME, using="")
	private WebElement inputBillAddress1;
	@FindBy(how=How.NAME, using="")
	private WebElement inputBillAddress2;
	@FindBy(how=How.NAME, using="")
	private WebElement inputBillCity;
	@FindBy(how=How.NAME, using="")
	private WebElement inputBillState;
	@FindBy(how=How.NAME, using="")
	private WebElement inputBillPostal;
	@FindBy(how=How.NAME, using="")
	private WebElement comboBillCountry;
	
	//Área Delivery Address
	@FindBy(how=How.NAME, using="")
	private WebElement inputDelAddress1;
	@FindBy(how=How.NAME, using="")
	private WebElement inputDelAddress2;
	@FindBy(how=How.NAME, using="")
	private WebElement inputDelCity;
	@FindBy(how=How.NAME, using="")
	private WebElement inputDelState;
	@FindBy(how=How.NAME, using="")
	private WebElement inputDelPostal;
	@FindBy(how=How.NAME, using="")
	private WebElement comboDelCountry;
	public WebElement getInputFirstName() {
		return inputFirstName;
	}
	public WebElement getInputLastName() {
		return inputLastName;
	}
	public WebElement getComboMeal() {
		return comboMeal;
	}
	public WebElement getComboCardType() {
		return comboCardType;
	}
	public WebElement getInputNumber() {
		return inputNumber;
	}
	public WebElement getComboExpirationMonth() {
		return comboExpirationMonth;
	}
	public WebElement getComboExpirationYear() {
		return comboExpirationYear;
	}
	public WebElement getInputFirstNameCard() {
		return inputFirstNameCard;
	}
	public WebElement getInputMiddleNameCard() {
		return inputMiddleNameCard;
	}
	public WebElement getInputLastNameCard() {
		return inputLastNameCard;
	}
	public WebElement getInputBillAddress1() {
		return inputBillAddress1;
	}
	public WebElement getInputBillAddress2() {
		return inputBillAddress2;
	}
	public WebElement getInputBillCity() {
		return inputBillCity;
	}
	public WebElement getInputBillState() {
		return inputBillState;
	}
	public WebElement getInputBillPostal() {
		return inputBillPostal;
	}
	public WebElement getComboBillCountry() {
		return comboBillCountry;
	}
	public WebElement getInputDelAddress1() {
		return inputDelAddress1;
	}
	public WebElement getInputDelAddress2() {
		return inputDelAddress2;
	}
	public WebElement getInputDelCity() {
		return inputDelCity;
	}
	public WebElement getInputDelState() {
		return inputDelState;
	}
	public WebElement getInputDelPostal() {
		return inputDelPostal;
	}
	public WebElement getComboDelCountry() {
		return comboDelCountry;
	}
	
	
}
