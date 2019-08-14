package org.sample.FacebookDetails;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
	 driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
		WebElement eachrow = trows.get(1);
		List<WebElement> tdata = eachrow.findElements(By.tagName("td"));
		for (WebElement data : tdata) {
			System.out.println(data.getText());
			}		
			
			}
		}
