package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage 
{
	WebDriver driver;
	public Cartpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 
	@FindBy(xpath="//*[text()='Add to cart']")

    WebElement Addtocart_button;
	
	@FindBy(xpath="//*[@class='styles__CartButton-sc-1hop3y3-0 cZezYN']")

	 WebElement cartimage_button;

    @FindBy(xpath="//*[text()='Continue']")

    WebElement continue_button;    

	public void click_continue()
	{
		
		Addtocart_button.click();
		cartimage_button.click();
		continue_button.click();
	}
	

}
