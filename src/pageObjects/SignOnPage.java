package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los WebElements de http://newtours.demoaut.com/mercurysignon.php
 * @author anamariaquinteroleal
 *
 */
public class SignOnPage extends PageBase{

	/**
	 * @param driver
	 * @param pageTitle
	 */
	public SignOnPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}
	//WebElements
	
	//Elemento web User Name
	@FindBy(how=How.NAME, using = "")
	private WebElement inputUserName;
	//Elemento web Password
	@FindBy(how=How.NAME, using = "")
	private WebElement inputPassword;
	//Elemento web User Name
	@FindBy(how=How.NAME, using = "")
	private WebElement buttonSingIn;
	
	//Getters
	
	public WebElement getInputUserName() {
		return inputUserName;
	}
	public WebElement getInputPassword() {
		return inputPassword;
	}
	public WebElement getButtonSingIn() {
		return buttonSingIn;
	}
	
	public void loginMercuryTours(String userName, String password){
		//Completar
	}
}
