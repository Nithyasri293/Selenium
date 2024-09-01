package com.test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("nithya29bns@gmail.com");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File sa = t.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\geethalakshmi\\Downloads\\nithya\\Selenium\\Screenshot\\FbScreenshot");
		FileUtils.copyFile(sa, f);
	}

}
