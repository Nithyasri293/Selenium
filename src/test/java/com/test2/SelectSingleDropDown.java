package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingleDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Create new account']"));
		signUp.click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("5");
		Thread.sleep(2000);
		s.selectByVisibleText("17");
		if (s.isMultiple()) {
			System.out.println("multiple option");
		}
		else {
			System.out.println("only one option");
		}
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement w = options.get(i);
			String text = w.getText();
			System.out.println(text);
			
		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement we = allSelectedOptions.get(i);
			String text1 = we.getText();
			System.out.println(text1);
			
		}
	}
	
	

}
