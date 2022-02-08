package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Mobilescreen 
{
	String actual;
	WebDriver driver;
	public Mobilescreen(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath="//*[text()=\"What's your number?\"]")  
	  WebElement MobileNumber;
	 @FindBy(xpath="//select[@name='phone-prefix-select']")
	 WebElement dropdown;
	 
	 @FindBy(xpath="//*[@name=\"phone-input\"]")
	 WebElement PhoneInput;
	 public void Dropdown() throws Exception
	 {
		 Thread.sleep(5000);
		Select dd=new Select(dropdown); 
		dd.selectByVisibleText("+49");
		Thread.sleep(5000);
	 }
	 public void verify_mobile_screen()
	 {
		MobileNumber.isDisplayed();
		
	 }
	 public void phonenumer(String number) throws InterruptedException
	 {
		
		//PhoneInput.sendKeys(Keys.ENTER);
		PhoneInput.sendKeys(number);
		Thread.sleep(5000);
	 }

}
