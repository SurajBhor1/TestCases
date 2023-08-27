package AETestlayer;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AEtasteBase.Initialize;

public class Ajio extends Initialize{
	@Parameters({"url"})
  @Test
  
  public void ajioTestCase(String url) throws InterruptedException {
	driver.get(url);  
	System.out.println("ajio has been opened");
	Thread.sleep(100);
	driver.close();
  }
}
