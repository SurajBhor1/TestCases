package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import AEtasteBase.Initialize;


public class ListnerSetup extends Initialize implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File(".\\TestCase\\screenShot\\fail.jpg");
	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

}
