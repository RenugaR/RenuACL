package org.sample.FacebookDetails;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions s=new Actions(driver);
		s.sendKeys("Matrixcare",Keys.ENTER).perform();
		gotolink("MatrixCare Reviews | Glassdoor.co.in");
	}
public static void gotolink(String link1) throws InterruptedException {
	List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String text = links.get(i).getText();
			if(text.equals(link1)) {
				links.get(4).click();
				break;
			}
		}
	}
}