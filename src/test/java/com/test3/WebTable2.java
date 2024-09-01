package com.test3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement element = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> elements = element.findElements(By.tagName("tr"));
		for (int i = 6; i < elements.size(); i++) {
			WebElement row = elements.get(5);
			
			
			List<WebElement> elements2 = row.findElements(By.tagName("td"));	//th is for title
			for (int j = 2; j < elements2.size(); j++) {
				WebElement datas = elements2.get(1);
				String text = datas.getText();
				System.out.println(text);
			}
		}
		WebElement ele = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> ele1 = ele.findElements(By.tagName("tr"));
		for (int i = 6; i < ele1.size(); i++) {
			WebElement row = elements.get(2);
			
			List<WebElement> elements2 = row.findElements(By.tagName("td"));	//th is for title
			for (int j = 2; j < elements2.size(); j++) {
				WebElement datas = elements2.get(1);
				String text = datas.getText();
				System.out.println(text);
			}
		}	
	}}
