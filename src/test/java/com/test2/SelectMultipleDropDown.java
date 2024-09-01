package com.test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleDropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select st=new Select(fruits);
		st.selectByIndex(1);
		st.selectByValue("orange");
		st.selectByVisibleText("Grape");
		//st.selectByIndex(3);
		List<WebElement> options = st.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement we = options.get(i);
			String text = we.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = st.getFirstSelectedOption();
		String text1 = firstSelectedOption.getText();	
		System.out.println(text1);
		
		List<WebElement> allSelectedOptions = st.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement we = allSelectedOptions.get(i);
			String text2 = we.getText();
			System.out.println(text2);
			
		}
		if (st.isMultiple()) {
			System.out.println("multiple option");
			
		} else {
			System.out.println("only one option");
		}
		st.deselectByIndex(0);
		
		
		
		
		
		
		
		
	}
}
