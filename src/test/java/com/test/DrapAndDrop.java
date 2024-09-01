package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions as=new Actions(driver);
		
		/*WebElement debit = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));	
		WebElement amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		as.dragAndDrop(debit, amount).perform();
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		as.dragAndDrop(bank, account).perform();*/
		
		
		WebElement credit = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));	
		WebElement amount1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		as.dragAndDrop(credit, amount1).perform();
		
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement account1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		as.dragAndDrop(sales, account1).perform();
		
		
	
	}

}
