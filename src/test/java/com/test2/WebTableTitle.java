package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableTitle {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement title = driver.findElement(By.xpath("//table[@id='customers']"));
        List<WebElement> elements = title.findElements(By.tagName("th"));
        for (int i = 0; i < elements.size(); i++) {
        	WebElement we = elements.get(i);
			String text = we.getText();
			System.out.println(text);
		}
		
	}

}
