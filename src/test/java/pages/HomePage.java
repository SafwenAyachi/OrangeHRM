package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	@FindBy(tagName="h6")
	WebElement verify;
	
	public HomePage() {
	 	PageFactory.initElements(Config.driver, this);
	}
	
	
	public void clickOnMenu(String menuName) {
		try {
			for(WebElement menu:menus) {
				if(menu.getText().contains(menuName)) {
				menu.click();
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	public void menuX (String pageName) {
		
		Assert.assertEquals(verify.getText(), pageName);
	}
	


}
