package AEpageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DataRead;

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
		DataRead data=new DataRead();
		Login_link.click();
		Email_text.sendKeys(data.user);
		 pswd_text.sendKeys(data.pass);
	}
	public void clickLogin() {
		Login_bttn.click();
	}
}
