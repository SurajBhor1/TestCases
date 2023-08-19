package AEpageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/login']")
	WebElement Login_link;
	@FindBy(xpath="//input[@type='email']")
	WebElement Email_text;
	@FindBy(xpath="//input[@type='password']")
	WebElement pswd_text;
	@FindBy(xpath="//input[@type='password'] //following-sibling::button")
	WebElement Login_bttn;
	
	public void enterCredential() {
		
		Login_link.click();
		Email_text.sendKeys("david456@gmail.com");
		 pswd_text.sendKeys("david456");
	}
	public void clickLogin() {
		Login_bttn.click();
	}
}
