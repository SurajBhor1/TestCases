package W3School.TestCase;

import org.testng.annotations.Test;

import AEtasteBase.Initialize;

public class Ajio extends Initialize{
  @Test
  public void ajioTestCase() throws InterruptedException {
	driver.get("https://www.ajio.com/");  
	System.out.println("ajio has been opened");
	Thread.sleep(100);
	driver.close();
  }
}
