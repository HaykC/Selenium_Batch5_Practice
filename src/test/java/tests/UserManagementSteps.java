package tests;

import java.time.Duration;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.CraterHomepage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class UserManagementSteps {
	
	BrowserUtils utils = new BrowserUtils();
	CraterHomepage login = new CraterHomepage();
	CommonPage common = new CommonPage();
	
	@Given("As a user, I am on the login page")
	public void as_a_user_i_am_on_the_login_page() {
	    Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
	    Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		utils.waitForElementToBeVisible(login.emailBox);
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	    utils.sendKeysWithActionClass(login.emailBox, TestDataReader.getProperty("email"));
	    utils.sendKeysWithActionClass(login.passwordBox, TestDataReader.getProperty("password"));
	    
	 
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	   login.loginBtn.click();
	    
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    utils.waitForElementToBeVisible(common.CommonPage_Dashboard);
	    Assert.assertTrue(common.CommonPage_Dashboard.isDisplayed());
	    
	}

}
