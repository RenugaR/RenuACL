package org.sample.FacebookDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("renupavi@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("dsfa230fd");
		WebElement btnlogin = driver.findElement(By.id("u_0_2"));
		btnlogin.click();
	}

}
