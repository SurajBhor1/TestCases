package AEpageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
public WebDriver driver;
public Home_page(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}	
	@FindBy(xpath="//a[text()=' Products']")
	private WebElement Product;
}
