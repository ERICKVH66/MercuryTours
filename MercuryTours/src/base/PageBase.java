package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	/**
	 * Crear el driver
	 */
	protected WebDriver driver;
	/**
	 * Título de página esperado. Será usuado en isPageLoad () para comprobar si
	 * la página está cargada.
	 */
	protected String pageTitle;

	public PageBase(WebDriver driver, String pageTitle) {
		this.driver = driver;
		this.pageTitle = pageTitle;
		//Inicializar los WebElements
		PageFactory.initElements(driver, this);
	}

	/**
	 * Comprueba si la página se carga comparando el título de página esperado
	 * con un título de página real.
	 **/
	public boolean isPageLoad() {
		return (driver.getTitle().contains(pageTitle));
	}

	/**
	 * Retorna el título de la página
	 */
	public String getTitle() {
		return pageTitle;
	}

	/**
	 * Envía el texto recibido al elemento que recibe por parámetro
	 * 
	 * @param element
	 * @param text
	 * @return
	 */
	public boolean sendText(WebElement element, String text) {
		boolean result = true;
		if (isElementPresentAndDisplay(element)) {
			element.sendKeys(text);
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * Hace clic sobre el elemento que recibe por parámetro
	 * 
	 * @param element
	 * @return
	 */
	public boolean clickButtonLink(WebElement element) {
		boolean result = true;
		if (isElementPresentAndDisplay(element)) {
			element.click();
		} else {

			result = false;

		}
		return result;
	}
	
	public boolean clickRadioButtonByName(List<WebElement> elements, String value) {
		boolean result = true;
		for(int i=0; i<elements.size();i++){
			String opciones=elements.get(i).getAttribute("value");
			if(opciones.equalsIgnoreCase(value)){
				elements.get(i).click();
				result=true;
				break;
			}
		}
		return result;
	}
	public boolean clickRadioButtonByNameContains(List<WebElement> elements, String value) {
		boolean result = true;
		for(int i=0; i<elements.size();i++){
			String opciones=elements.get(i).getAttribute("value");
			if(opciones.contains(value)){
				elements.get(i).click();
				result=true;
				break;
			}
		}
		return result;
	}
	/**
	 * Verifica si el texto esta presente en la página
	 */
	public boolean isTextPresent(String text) {
		return driver.getPageSource().contains(text);
	}

	/**
	 * Verifica si el elemento esta presente en la página
	 */
	public boolean isElementPresentAndDisplay(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	/**
	 * Selecciona una opción del combo box por su texto
	 * @param element
	 * @param text
	 * @return
	 */
	public boolean selectDropdownVisibleText(WebElement element, String text){
		boolean result = true;
		Select listBox;
		if(isElementPresentAndDisplay(element)){
			listBox= new Select(element);
			listBox.selectByVisibleText(text);
		}else {
			result = false;
		}
		return result;
	}
	/**
	 * Selecciona una opción del combo box por su valor
	 * @param element
	 * @param value
	 * @return
	 */
	public boolean selectDropdownValue(WebElement element, String value){
		boolean result = true;
		Select listBox;
		if(isElementPresentAndDisplay(element)){
			listBox= new Select(element);
			listBox.selectByValue(value);
		}else {
			result = false;
		}
		return result;
	}
	
	/**
	 * Método que obtiene el texto de un elemento y verifica que sea igual al esperado
	 * @param element
	 * @param text
	 * @return
	 */
	public boolean getTextElement(WebElement element, String text){
		return element.getText().equalsIgnoreCase(text);
	}
	
	/**
	 * Selecciona una opción del combo box por su valor, 
	 * este método es para acceder a opciones cuando se manejan multiples capas en el frontend
	 * @param combo
	 * @param comboOptions
	 * @param text
	 * @return
	 */
	public boolean selectDropdownAjax(WebElement combo, WebElement comboOptions, String text){
		boolean result = true;
		if(isElementPresentAndDisplay(combo)){
			 List<WebElement> options=comboOptions.findElements(By.tagName("li"));
			    
			    for (WebElement option : options)
			    {
			        if (option.getText().equals(text))
			        {
			            option.click(); // click the desired option
			            break;
			        }
			    }
		}else {
			result = false;
		}
		return result;
	}
}