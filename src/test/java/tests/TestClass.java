package tests;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CraterHomepage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class TestClass {

	static CraterHomepage craterLogin;
	static WebDriverWait wait;
	static BrowserUtils utils;

	public static void main(String[] args) {
		craterLogin = new CraterHomepage();
		utils = new BrowserUtils();
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));

//		craterLogin.emailBox.sendKeys(TestDataReader.getProperty("email"));
//		craterLogin.passwordBox.sendKeys(TestDataReader.getProperty("password"));

		utils.waitForElementToBeVisible(craterLogin.emailBox);
//		Actions action = new Actions(Driver.getDriver());
//		action.sendKeys(craterLogin.emailBox, TestDataReader.getProperty("email")).build().perform();
		utils.sendKeysWithActionClass(craterLogin.emailBox, TestDataReader.getProperty("email"));

	}

}
