package org.sample.FacebookDetails;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot) driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\GreenTech\\FacebookDetails\\Screenshots samples.png");
		FileUtils.copyFile(f, d);	
	}

}
