package com.main;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.base.TwitterBase;
import com.pages.CreateYourAccPage;
import com.pages.CustomizePage;
import com.pages.createAccountPage;

public class Sample extends TwitterBase {
	
	
	
	@BeforeClass
	public static void urlLaunch() {
		getDriver();

	}
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@Test
	public void loadURL() {
		loadURL("https://twitter.com/i/flow/signup");
		maxWindow();
	}
	
	@Test
	public void createAccount() throws InterruptedException {
		createAccountPage cp = new createAccountPage();
		WebElement name = cp.getName();
		type(name, "VaishnaviSundar");
		
		WebElement phone = cp.getPhno();
		type(phone, "91369019");
		
		WebElement month = cp.getMonth();
		selectdd(month, "December");
		
		WebElement day = cp.getDay();
		selectdd(day, "1");
		
		WebElement year = cp.getYear();
		selectdd(year, "2001");
		
		Thread.sleep(1000);

		WebElement next = cp.getNext1();
		btnClick(next);
		
		Thread.sleep(1000);
	}

	@Test
	public void customize() throws InterruptedException {
		CustomizePage cp1 = new CustomizePage();
		WebElement next2 = cp1.getNext2();
		btnClick(next2);
		Thread.sleep(1000);

	}
	
	@Test
	public void CreateYourAcc() {
		CreateYourAccPage cp2 = new CreateYourAccPage();
		WebElement signUp = cp2.getSignUp();
		btnClick(signUp);

	}
	

}
