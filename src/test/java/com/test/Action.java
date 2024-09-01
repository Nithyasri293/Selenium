package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		Actions a=new Actions(driver);
		WebElement developers = driver.findElement(By.xpath("//button[text()='Developers']"));
		a.moveToElement(developers).perform();
		WebElement documentation = driver.findElement(By.xpath("//a[@title='Support']"));
		documentation.click();
	}

}
