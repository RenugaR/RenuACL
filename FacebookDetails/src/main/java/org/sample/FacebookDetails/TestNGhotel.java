package org.sample.FacebookDetails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGhotel {
	
	 @Test    
	    public void executSessionOne(){
	            //First session of WebDriver
		 System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
			WebDriver driver=new ChromeDriver();
	            driver.get("https://secure.expresstrucktax.com/");
	        	driver.manage().window().maximize();
	        	driver.findElement(By.id("EmailAddress")).sendKeys("pauldaniel+2290@spanllc.com");
	        	driver.findElement(By.id("Password")).sendKeys("haihai");
	        	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[8]/a[1]")).click();
	        	driver.findElement(By.id("createReturn308802")).click();
	        	driver.close();
	        }   
	    @Test    
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	    	System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
			WebDriver driver=new ChromeDriver();
	        driver.get("https://secure.expresstrucktax.com/");
        	driver.manage().window().maximize();
        	driver.findElement(By.id("EmailAddress")).sendKeys("pauldaniel+2290@spanllc.com");
        	driver.findElement(By.id("Password")).sendKeys("haihai");
        	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[8]/a[1]")).click();
        	driver.findElement(By.id("createReturn308802")).click();
        	driver.close();
	        }
	        
	    @Test    
	        public void executSessionThree(){
	            //Third session of WebDriver
	    	System.setProperty("webdriver.chrome.driver", "C:\\GreenTech\\SeleniumDay1\\drivers\\ChromeDriver.exe");			
			WebDriver driver=new ChromeDriver();
	        driver.get("https://secure.expresstrucktax.com/");
        	driver.manage().window().maximize();
        	driver.findElement(By.id("EmailAddress")).sendKeys("pauldaniel+2290@spanllc.com");
        	driver.findElement(By.id("Password")).sendKeys("haihai");
        	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[8]/a[1]")).click();
        	driver.findElement(By.id("createReturn308802")).click();
        	driver.close();
	        
	        }        
	
}
