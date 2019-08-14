package org.sample.FacebookDetails;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
	 driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	driver.manage().window().maximize();
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < trows.size(); i++) {
		WebElement eachrow = trows.get(i);
		List<WebElement> tdata = eachrow.findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
			WebElement eachdata = tdata.get(j);
			System.out.println(eachdata.getText());
				/*
				 * String name = eachdata.getText(); if (name.equals("China")) {
				 * System.out.println(tdata.get(4).getText()); }
				 */
			}
		}
	}
}
