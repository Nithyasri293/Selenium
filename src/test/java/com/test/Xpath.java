package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("nithya29@gmail.com");
		password.sendKeys("Nithya");
		login.click();
	}

}
