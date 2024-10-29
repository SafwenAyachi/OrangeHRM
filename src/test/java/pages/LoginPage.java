package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class LoginPage {
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btnLogin;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement verifyLOK;
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifyLKO;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect(String USERNAME,String PASSWORD) {
		Config.attente(10);
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);
		btnLogin.click();
	}
	
	public void verifyok(String verifyTest) {
		Assert.assertEquals(verifyLOK.getText(), verifyTest);
	
	
	}
	public void verifyko(String verifyTest) {
		Assert.assertEquals(verifyLKO.getText(), verifyTest);
	}
	

}
