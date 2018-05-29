package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead {

public static RemoteWebDriver driver;
	
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	@And("Set the timeout")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("Enter the url for TestLeaf")
	public void getUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}
	
	@And("Enter the username as (.*)")
	public void username(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	
	@And("Enter the password as (.*)")
	public void password(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	
	@And("Click on Login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
	}
	
	@And("Click on Lead tap")
	public void clickLeadTap() {
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
	}
	
	@And("Click on Find lead option")
	public void clickLeadOption() {
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[3]").click();
	}
	
	@And("Enter the Firstname as (.*)")
	public void enterFirstName(String data) {
		driver.findElementById("(//div[@class='x-form-element']/input)[12]").sendKeys(data);
	}
	
	@And("Click on Find Lead button to search")
	public void clickFindLeadOption() {
		driver.findElementByXPath("(//button[@class='x-btn-text'])[6]").click();
	}
	
	@And("Select the first option")
	public void selectFirstOption() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
	}
	
	@And("Click on Edit button")
	public void clickEditButton() {
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
	}
	
	@And("Add Descriptions as (.*)")
	public void enterDescription(String data) {
		driver.findElementById("updateLeadForm_description").sendKeys(data);	
	}
	
	
	@And("Click on update button")
	public void clickUpdate() {
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
	}
	
	@When("Verify edit lead created successfully")
	public void verifyLead() {
		String text = driver.findElementById("viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("New Create Lead successful");
		else
			System.out.println("Not created new lead");
	}
	
	@Then("Close the browser")
	public void closeBrowser() {
		driver.quit();
	}
	
}
