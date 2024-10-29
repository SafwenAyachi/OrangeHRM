package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	  Config.driver = new ChromeDriver();
	  Config.confChrome();
	  Config.maxWindow();
	  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  Config.driver.get(url);
	  Config.attente(10);
	}

	@When("user enters a valid usernamer {string} and a valid password {string}")
	public void user_enters_a_valid_usernamer_and_a_valid_password(String username, String password) {
		LoginPage page = new LoginPage();
	    page.connect(username, password);
	}

	@Then("user redirects to home page with message {string}")
	public void user_redirects_to_home_page_with_message(String pageTitle) {
		LoginPage page = new LoginPage();
	    page.verifyok(pageTitle);
	    Config.closeBrowser();
	}

	@When("user enters a invalid usernamer {string} and a valid password {string}")
	public void user_enters_a_invalid_usernamer_and_a_valid_password(String username, String password) {
		LoginPage page = new LoginPage();
		Config.attente(10);
	    page.connect(username, password);
	}

	@Then("user redirects satays in login page with alert message {string}")
	public void user_redirects_satays_in_login_page_with_alert_message(String pageTitle) {
		LoginPage page = new LoginPage();
		page.verifyko(pageTitle);
		Config.closeBrowser();
	}


}
