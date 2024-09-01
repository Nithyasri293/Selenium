package com.test2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("redmi note 13 pro plus ");
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchButton.click();
		WebElement phone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	    phone.click();
	    String windowHandle = driver.getWindowHandle();
	    System.out.println(windowHandle);
	    Set<String> whs = driver.getWindowHandles();
	    System.out.println(whs);
	    for (String id : whs) {
			if (!id.equals(whs)) {
				driver.switchTo().window(id);
			}
		}
	    WebElement addToCart = driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]"));
	    addToCart.click();
	
	
	
	
	}

}
