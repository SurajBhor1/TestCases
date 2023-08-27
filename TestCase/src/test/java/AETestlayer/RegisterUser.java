package AETestlayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import AEpageLayer.LoginPage;
import AEtasteBase.Initialize;

public class RegisterUser extends Initialize {
	@Test
	public void Login() {
		LoginPage log = new LoginPage(driver);
		log.enterCredential();
		log.clickLogin();
		String act = driver.findElement(By.xpath("//a[text()=' Home']")).getAttribute("Style");

		Assert.assertEquals(act, "color: orange;");
		boolean b = driver.findElement(By.xpath("//div[@class='login-form']//child::h2")).isDisplayed();
		Assert.assertFalse(b);
	}

}
