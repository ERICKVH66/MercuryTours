package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.PageBase;

/**
 * Clase que contiene los WebElements de http://newtours.demoaut.com/mercuryregister.php
 * @author anamariaquinteroleal
 *
 */
public class RegistrarUsuarioPage extends PageBase {

	/**
	 * @param driver
	 * @param pageTitle
	 */
	public RegistrarUsuarioPage(WebDriver driver, String pageTitle) {
		super(driver, pageTitle);
	}
	// WebElements

	/**
	 * Área Contact Information
	 */
	@FindBy(how = How.NAME, using = "firstName")
	private WebElement inputFirstName;
	@FindBy(how = How.NAME, using = "lastName")
	private WebElement inputLastName;
	@FindBy(how = How.NAME, using = "phone")
	private WebElement inputPhone;
	@FindBy(how = How.ID, using = "userName")
	private WebElement inputImail;

	/**
	 * Área Mailing Information
	 */
	@FindBy(how = How.NAME, using = "")
	private WebElement inputAddress1;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputAddress2;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputCity;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputState;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputPostal;
	@FindBy(how = How.NAME, using = "")
	private WebElement comboCountry;

	/**
	 * Área de User Information
	 */
	@FindBy(how = How.ID_OR_NAME, using = "")
	private WebElement inputUserName;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputPassword;
	@FindBy(how = How.NAME, using = "")
	private WebElement inputConfirmPassword;
	@FindBy(how = How.NAME, using = "")
	private WebElement botonSubmit;

	// Getters

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public WebElement getInputLastName() {
		return inputLastName;
	}

	public WebElement getInputPhone() {
		return inputPhone;
	}

	public WebElement getInputImail() {
		return inputImail;
	}

	public WebElement getInputAddress1() {
		return inputAddress1;
	}

	public WebElement getInputAddress2() {
		return inputAddress2;
	}

	public WebElement getInputCity() {
		return inputCity;
	}

	public WebElement getInputState() {
		return inputState;
	}

	public WebElement getInputPostal() {
		return inputPostal;
	}

	public WebElement getComboCountry() {
		return comboCountry;
	}

	public WebElement getInputUserName() {
		return inputUserName;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getInputConfirmPassword() {
		return inputConfirmPassword;
	}

	public WebElement getBotonSubmit() {
		return botonSubmit;
	}
	//Completar
	public void registrarInformacionContacto(String firstName, String lastName, String phone, String email){
		
	}
	//Completar
	public void registrarInformacionCorreo(){
		
	}
	/**
	 * Ingreso datos área del formulario User Information
	 * @param userName
	 * @param password
	 * @param confirmPassword
	 */
	public void registrarInformacionUsuario(String userName, String password, String confirmPassword){
		sendText(getInputUserName(), userName);
		sendText(getInputPassword(), password);
		sendText(getInputConfirmPassword(), confirmPassword);
		clickButtonLink(getBotonSubmit());
	}

}
