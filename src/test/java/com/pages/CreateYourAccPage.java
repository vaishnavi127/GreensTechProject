package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TwitterBase;

public class CreateYourAccPage extends TwitterBase{
	
	public CreateYourAccPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]")
	private WebElement signUp;
	
	
	public WebElement getSignUp() {
		return signUp;
	}

}
