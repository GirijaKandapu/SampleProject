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
	
	@When("user tests Checkboxes functionality")
	public void user_tests_checkboxes_functionality() {
		ModuleClass.checkboxesFunctionality();
	}
	@When("user tests Mousehover functionality")
	public void user_tests_mousehover_functionality() {
		ModuleClass.mousehoverFunctionality();
	}
	@When("user tests Dropdown functionality")
	public void user_tests_dropdown_functionality() {
		ModuleClass.dropdownFunctionality();
	}
	@When("user tests Frames functionality")
	public void user_tests_frames_functionality() {
		ModuleClass.framesFunctionality();
	}
	@Then("user closes the browser")
	public void user_closes_the_browser() {
		ModuleClass.closeBrowser();
	}
}
