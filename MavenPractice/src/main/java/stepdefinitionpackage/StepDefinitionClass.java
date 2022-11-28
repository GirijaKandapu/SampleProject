package stepdefinitionpackage;

import java.util.Map;

import io.cucumber.java.en.*;
import modulepackage.ModuleClass;

public class StepDefinitionClass {

	@When("^Browser Initiation$")
	public void Browserinitiation(Map<String, String> Data) {
		ModuleClass.browserInitiation(Data.get("URL"));
	}
	
	@And("^Login to Gmail account$")
	public void GmailAccountlogin() {
		ModuleClass.gmailAccountLogin();
	}
	
	@And("^Compose Email$")
	public void ComposeEmail() {
		ModuleClass.composeEmail();
	}
	
	@Then("^Logout of Gmail account$")
	public void LogoutGmailaccount() {
		ModuleClass.logoutGmailAccount();
	}
}
