package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CommunStepDef {
	
	@Given("User login with valid username {string} and password {string}")
	public void user_login_with_valid_username_and_password(String username, String password) {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		Config.maxWindow();
		LoginPage page = new LoginPage();
		page.connect(username, password);
		
		//Config.attente(10);
		
}


    
}