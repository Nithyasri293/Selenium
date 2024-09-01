package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alert.click();
		WebElement alertWithTextBox = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alertWithTextBox.click();
		
		Alert a=driver.switchTo().alert();
		//String text = a.getText();
		//System.out.println(text);
		a.sendKeys("Nithyasri");
		a.accept();
		//a.dismiss();
	}

}
