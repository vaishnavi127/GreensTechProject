package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TwitterBase;

public class CustomizePage extends TwitterBase{
	
	public CustomizePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getNext2() {
		return Next2;
	}


	@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/span/span")
	private WebElement Next2;

}
