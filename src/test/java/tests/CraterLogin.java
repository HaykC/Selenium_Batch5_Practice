package tests;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CraterHomepage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class CraterLogin {

    static	CraterHomepage login;
    static WebDriverWait wait;
	static BrowserUtils utils;
	
	public static void main(String[] args) {
		CraterLogin();
		
	}
	
	public static void CraterLogin() {
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
		login = new CraterHomepage();

		
		utils = new BrowserUtils();
		Actions action = new Actions(Driver.getDriver());
		action.sendKeys(login.emailBox, TestDataReader.getProperty("email")).build().perform();
		action.sendKeys(login.passwordBox, TestDataReader.getProperty("password")).build().perform();
		login.loginBtn.click();
		
		
	}

}


