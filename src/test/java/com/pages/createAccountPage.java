package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TwitterBase;

public class createAccountPage extends TwitterBase{
	
	public createAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@autocomplete=\"name\"]")
	private WebElement name;
	
	
	@FindBy(xpath="//input[@autocomplete=\"tel\"]")
	private WebElement phno;
	
	@FindBy(xpath="//select[@aria-label=\"Month\"]")
	private WebElement month;
	
	@FindBy(xpath="//select[@aria-label=\"Day\"]")
	private WebElement day;
	
	@FindBy(xpath="//select[@aria-label=\"Year\"]")
	private WebElement year;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div")
	private WebElement Next1;
	
	
	public WebElement getName() {
		return name;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getNext1() {
		return Next1;
	}


}
