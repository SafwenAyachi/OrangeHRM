package testSuites;

import helper.Config;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageStepDef {
	

	
	

	@When("user clicks on {string}")
	public void user_clicks_on(String menu) {
		HomePage page = new HomePage();
		page.clickOnMenu(menu);
	   
	}

	@Then("user directs to the {string} page")
	public void user_directs_to_the_page(String menuName) {
		HomePage page = new HomePage();
		page.menuX(menuName);
	   Config.closeBrowser();
	}

}
