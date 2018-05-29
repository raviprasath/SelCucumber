package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	@And("Enter the Company Name as (.*)")
	public CreateLeadPage enterCompanyName(String CompanyName) {
		type(eleCompanyName, CompanyName);
		return this;
	}


	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleFirstName;

	@And("Enter the Firstname as (.*)")
	public  CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	@And("Enter the Lastname as (.*)")
	public  CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;
	}

	
	@FindBy(how=How.XPATH ,using="//input[@class='smallSubmit']")
	private WebElement eleCreateLead;

	@When("Click on Create Lead button")
	public  ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	
	
	
}

