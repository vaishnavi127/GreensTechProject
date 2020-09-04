package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwitterBase {
	
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver_win32\\chromedriver.exe");
		//C:\Users\Bharath\eclipse-workspace\Adactin\Driver\chromedriver_win32
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public static void loadURL(String url) {
		driver.get(url);

	}
	
	public void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void type(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static void selectdd(WebElement element, String data) {
		Select s= new Select(element);
		s.selectByVisibleText(data);
	}

}
