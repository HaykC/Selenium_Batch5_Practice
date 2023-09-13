package tests;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import pages.CraterHomepage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class UserManagementTests {

	static CraterHomepage home;
	static BrowserUtils utils;
	static Actions action;
	
	public static void main(String[] args) throws InterruptedException {
	//	invalidEmailLoginTest();
		invalidEmailLoginTest2();
	}
	
	public static void invalidEmailLoginTest() throws InterruptedException {
		home = new CraterHomepage();
		utils = new BrowserUtils();
		action = new Actions(Driver.getDriver());
		
		
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		utils.waitForElementToBeVisible(home.emailBox);
		home.loginBtn.click();
		
		utils.waitForAllElementsToBeVisible(home.requiredFieldMessages);
		if(home.requiredFieldMessages.size() == 2) {
			System.out.println("There are 2 required field messages displayed");
		}else {
			System.out.println("something is wrong with required fiels text messages");
		}

		Driver.getDriver().quit();
		
	}

	public static void invalidEmailLoginTest2() {
			home = new CraterHomepage();
			utils = new BrowserUtils();
			action = new Actions(Driver.getDriver());
			String invalidPassword = "adlfhvefvb@gmail.com";
			
			
			Driver.getDriver().manage().window().maximize();
			Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
			Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			utils.waitForElementToBeVisible(home.emailBox);
			Actions action = new Actions(Driver.getDriver());
			action.sendKeys(home.emailBox, TestDataReader.getProperty("email")).build().perform();
			action.sendKeys(home.passwordBox, invalidPassword).build().perform();
			home.loginBtn.click();
	}
}
