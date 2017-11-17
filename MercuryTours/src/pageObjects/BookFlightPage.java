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
	
	//Ã�rea Passenger
	@FindBy(how = How.NAME, using = "passFirst0")
	private WebElement inputFirstName;
	@FindBy(how = How.NAME, using = "passLast0")
	private WebElement inputLastName;
	@FindBy(how = How.NAME, using = "pass.0.meal")
	private WebElement comboMeal;
	//Le damos un valor al comboMeal
	@FindBy(how = How.XPATH, using = "//input[@name='pass.0.meal'][contains(@value,'BLML')]")
	private WebElement comboMealBLML;
	
	/**
	 * Metodo que me obtiene el/la  comboMealBLML
	 * @return  comboMealBLML
	 */
	public WebElement getComboMealBLML() {
		return comboMealBLML;
	}

	//Ã�rea Credit Card
	@FindBy(how=How.NAME, using="creditCard")
	private WebElement comboCardType;
	//Le damos valor al combo cardtype
	@FindBy(how=How.XPATH,using="//input[@name='creditCard'][containd(@value='AX']")
	private WebElement comboCardTypeAX;
	/**
	 * Metodo que me obtiene el/la  comboCardTypeAX
	 * @return  comboCardTypeAX
	 */
	public WebElement getComboCardTypeAX() {
		return comboCardTypeAX;
	}
	@FindBy(how=How.NAME, using="creditnumber")
	private WebElement inputNumber;
	@FindBy(how=How.NAME, using="cc_exp_dt_mn")
	private WebElement comboExpirationMonth;
	//Valor comboExpiratrionMonth
	@FindBy(how=How.XPATH, using="//input[@name='cc_exp_dt_mn'][contains(@selected,'01')]")
	private WebElement option01;
	/**
	 * Metodo que me obtiene el/la  option01
	 * @return  option01
	 */
	public WebElement getOption01() {
		return option01;
	}
	@FindBy(how = How.CSS, using = "[name='cc_exp_dt_yr'][value*='roundtrip']")
	//@FindBy(how=How.NAME, using="cc_exp_dt_yr")
	private WebElement comboExpirationYear;
	@FindBy(how=How.XPATH, using ="//input[@name='cc_exp_dt_yr'][contains(@value='2000')]")
	private WebElement comboExpirationYear2000;
	/**
	 * Metodo que me obtiene el/la  comboExpirationYear2000
	 * @return  comboExpirationYear2000
	 */
	public WebElement getComboExpirationYear2000() {
		return comboExpirationYear2000;
	}
	@FindBy(how=How.NAME, using="cc_frst_name")
	private WebElement inputFirstNameCard;
	@FindBy(how=How.NAME, using="cc_mid_name")
	private WebElement inputMiddleNameCard;
	@FindBy(how=How.NAME, using="cc_last_name")
	private WebElement inputLastNameCard;
	
	//Ã�rea Billing Address
	@FindBy(how=How.NAME, using="billAddress1")
	private WebElement inputBillAddress1;
	@FindBy(how=How.NAME, using="billAddress2")
	private WebElement inputBillAddress2;
	@FindBy(how=How.NAME, using="billCity")
	private WebElement inputBillCity;
	@FindBy(how=How.NAME, using="billState")
	private WebElement inputBillState;
	@FindBy(how=How.NAME, using="billZip")
	private WebElement inputBillPostal;
	@FindBy(how=How.NAME, using="billCountry")
	private WebElement comboBillCountry;
	
	//Ã�rea Delivery Address
	@FindBy(how=How.NAME, using="delAddress1")
	private WebElement inputDelAddress1;
	@FindBy(how=How.NAME, using="delAddress2")
	private WebElement inputDelAddress2;
	@FindBy(how=How.NAME, using="delCity")
	private WebElement inputDelCity;
	@FindBy(how=How.NAME, using="delState")
	private WebElement inputDelState;
	@FindBy(how=How.NAME, using="delZip")
	private WebElement inputDelPostal;
	@FindBy(how=How.NAME, using="delCountry")
	private WebElement comboDelCountry;
	@FindBy(how=How.NAME, using="buyFlights")
	private WebElement btnSecurePurchase;
	
	/**
	 * Metodo que me obtiene el/la  btnSecurePurchase
	 * @return  btnSecurePurchase
	 */
	public WebElement getBtnSecurePurchase() {
		return btnSecurePurchase;
	}
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
	public void bookMercuryTours(String firstName,String lastName,String number,String firstNameCard, String middle,String lastCard)
	{
		sendText(inputFirstName, firstName);
		sendText(inputLastName, lastName);
		sendText(inputNumber,number);
		sendText(inputFirstNameCard, firstNameCard);
		sendText(inputMiddleNameCard,middle);
		sendText(inputLastNameCard, lastCard);
		
	}
}
