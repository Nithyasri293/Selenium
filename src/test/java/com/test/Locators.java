package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
        
		email.sendKeys("nithya29bns@gmail.com");
		password.sendKeys("125896454");
		password.clear();
		password.sendKeys("bjhgdjhdj12");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
