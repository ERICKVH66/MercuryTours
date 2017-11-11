package scriptSencillo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.TestBase;
import pageObjects.FindFlightPage;
import pageObjects.LoginPage;
import utils.ExcelUtils;
import utils.ExcelUtils.ExcelType;

/**
 * Se realiza un ejemplo sencillo para realizar el registro de más de dos
 * clientes http://samples.genexus.com/ajaxsample/client.aspx?INS,0
 * 
 * @author anamariaquinteroleal
 *
 */
public class MultiplesDatos extends TestBase {
	protected LoginPage login;
	protected FindFlightPage findFlight;
	// Utilidad para el manejo de excel
	static ExcelUtils excelVariosLogin;
	private String pageTitleIndex = "Welcome: Mercury Tours";
	private String userName = "";
	private String password = "";
	private String sCantidadRegistros = "";
	private int cantidadRegistros = 0;

	@Test
	public void testUntitled() {
		// Se crea la instancia para manejar el archivo VariosRegistros.xlsx
		try {
			excelVariosLogin = new ExcelUtils("VariosRegistros.xlsx", ExcelType.XLSX);
			sCantidadRegistros = excelVariosLogin.getCellData(0, 1);
			System.out.println(sCantidadRegistros);	
			cantidadRegistros=(int)Float.parseFloat(sCantidadRegistros);
			for(int i=0; i<cantidadRegistros;i++){
				userName = excelVariosLogin.getCellData(2+i, 0);
				password = excelVariosLogin.getCellData(2+i, 1);
				System.out.println(userName + "-" + password);

				login = new LoginPage(driver, pageTitleIndex);

				// Diligenciar UserName
				login.getInputUserName().clear();
				login.getInputUserName().sendKeys(userName);
				// Diligenciar Apellido
				login.getInputPassword().clear();
				login.getInputPassword().sendKeys(password);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
