package com.pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	
	WebDriver driver;
	 
	 
	public Homepage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 
	@FindBy(xpath="//*[@class='wfhkog-3 LCKRU']")

    WebElement txtbx_search;

    @FindBy(xpath="//*[text()='View all brands']")

    WebElement clickonbrand;    

    @FindBy(xpath="//*[@value='Hp']")

    WebElement Select_Hp_Brand;
	 
    @FindBy(xpath="(//*[@class='verticalStyles__Name-sc-1je3l7s-6 iSfTtA'])[2]")
    WebElement Select_Samsung_product;

	public void Search_product(String product)
	{
		txtbx_search.click();
		txtbx_search.sendKeys(product);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		txtbx_search.sendKeys(Keys.ENTER);
//		clickonbrand.click();
//		Select_Hp_Brand.click();
		Select_Samsung_product.click();
    }

}
