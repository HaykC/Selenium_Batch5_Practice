package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class itemsPage {
	
	public itemsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "check_uv7wfutyy")
	public WebElement itemsPage_checkBox;
	
	@FindBy (xpath = "//th[text()='Name ']")
	public WebElement itemsPage_Name;
	
	@FindBy (xpath = "//th[text()='Unit ']")
	public WebElement itemsPage_Unit;
	
	@FindBy (xpath = "//th[text()='Price ']")
	public WebElement itemsPage_Price;
	
	@FindBy (xpath = "//th[text()='Added On ']")
	public WebElement itemsPage_Added_On;
	
	@FindBy (id = "headlessui-menu-button-58")
	public WebElement itemsPage_3_Dots_Btn;
	
	@FindBy (name = "name")
	public WebElement itemsPage_NewItem_Name;
	
	@FindBy (xpath = "//div[text()='select unit']")
	public WebElement itemsPage_NewItem_SelectUnit;
	
	@FindBy (id = "0")
	public WebElement itemsPage_NewItem_Price;
	
}
