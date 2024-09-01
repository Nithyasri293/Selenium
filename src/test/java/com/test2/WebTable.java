package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> table = driver.findElements(By.tagName("table"));
		int size = table.size();
		System.out.println("Tables present in webpages:"+size);
	}

}
