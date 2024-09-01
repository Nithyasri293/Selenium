package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert.click();
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
