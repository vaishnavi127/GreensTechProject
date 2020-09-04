package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TwitterBase;

public class SignUpPage extends TwitterBase{
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@href=\"/i/flow/signup\"]")
	private WebElement signUp;
		

}
