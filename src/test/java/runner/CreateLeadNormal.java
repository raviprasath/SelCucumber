package runner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadNormal {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.70:5544/wd/hub"), dc);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByXPath("(//div[@id='label']/a)[1]").click();
		driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
		driver.findElementByXPath("//div[@class='frameSectionBody']/ul/li[2]").click();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ravi");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");

		Select industry = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		industry.selectByIndex(4);

		Select ownership = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		ownership.selectByVisibleText("Partnership");
		
		/*List<WebElement> currency = driver.findElementsById("createLeadForm_currencyUomId");
		
		for (WebElement list : currency) {
			String currencyList = list.getText();
			System.out.println("Available currency lists are: "+currencyList);	
		}*/

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9176506073");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		Thread.sleep(2000);
		String text = driver.findElementById("viewLead_firstName_sp").getText();

		if(text.equalsIgnoreCase("Ravi"))
			System.out.println("New Create Lead successful");
		else
			System.out.println("Not created new lead");

		driver.close();

	}
}
