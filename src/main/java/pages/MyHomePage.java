package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{


		public MyHomePage() {
			PageFactory.initElements(driver,this);
		}

		@FindBy(how=How.XPATH ,using="(//div[@class='x-panel-header'])[2]")
		private WebElement eleLeads;

		@And("Click on Lead tap")
		public MyLeadPage clickLeads() {
			click(eleLeads);
			return new MyLeadPage();
		}
}
