package AEtasteBase;



import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import Utility.DataRead;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialize {
	public WebDriver driver;
	@ BeforeTest
	public void setup() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
	//DataRead data=new DataRead();
	
		
		//driver.get(data.getData());
	}

}
