package tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CraterHomepage;
import utils.BrowserUtils;
import utils.TestDataReader;

public class InvalidLoginSteps {
		BrowserUtils utils = new BrowserUtils();
		CraterHomepage login = new CraterHomepage();
		// invalid email login attempt - start
		@When("I enter invalid username and valid password")
		public void i_enter_invalid_username_and_valid_password() {
		utils.sendKeysWithActionClass(login.emailBox, "yummy@primetechschool.com");
		utils.sendKeysWithActionClass(login.passwordBox, TestDataReader.getProperty("password"));
		login.loginBtn.click();
		}

		@Then("I should see an error message {string} displays")
		public void i_should_see_an_error_message_displays(String errorMessage) {
		    utils.waitForElementToBeVisible(login.wrongCredentialsError);
		    Assert.assertEquals(errorMessage, login.wrongCredentialsError.getText());
		    
		}

		@Then("I should not be logged in")
		public void i_should_not_be_logged_in() {
		   Assert.assertTrue(login.loginBtn.isDisplayed());
		}
		// invalid email login attempt - end

}
 