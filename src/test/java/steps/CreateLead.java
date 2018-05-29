package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	
	/*public static RemoteWebDriver driver;
	
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
	
	@And("Click on Create Lead option")
	public void clickLeadOption() {
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[2]").click();
	}
	
	@And("Enter the Company Name")
	public void enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	}
	
	@And("Enter the Firstname")
	public void enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Ravi");
	}
	
	@And("Enter the Lastname")
	public void enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
	}
	
	@And("Click on Create Lead button")
	public void clickCreateLead() {
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	}
	
	@When("Verify create lead created successfully")
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
	}*/
}
