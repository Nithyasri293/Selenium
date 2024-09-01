package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alert.click();
		WebElement alertOKAndCancel = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alertOKAndCancel.click();
		
		Alert a=driver.switchTo().alert();
		//a.accept();
		a.dismiss();
	}

}
