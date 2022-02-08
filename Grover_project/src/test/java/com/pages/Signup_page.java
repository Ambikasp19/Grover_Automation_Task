package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Signup_page {

	WebDriver driver;
	String PRODUCT = "Samsung";

	public Signup_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='login-email-input']")

	WebElement UserName;

	@FindBy(xpath = "//*[@id='login-password-input']")

	WebElement UserPassword;

	@FindBy(xpath = "//*[text()='Log in']")

	WebElement loginButton;

	public void username(String uid) throws InterruptedException {
		UserName.sendKeys(uid);

	}

	public void password(String pass) {
		UserPassword.sendKeys(pass);
		loginButton.click();
	}

	public void verify_test() {
		try {

			List<WebElement> After = driver
					.findElements(By.xpath("//*[@class='verticalStyles__Name-sc-1je3l7s-6 iSfTtA']"));

			System.out.println(After.size());
			for (int i = 0; i < After.size(); i++) {
				String temp = After.get(i).getText();
				SoftAssert Assert = new SoftAssert();
				if ((temp.toLowerCase().contains(PRODUCT.toLowerCase()))) {
					Assert.assertTrue(true);
					System.out.println(PRODUCT + " is displayed on Product Title: " + temp);
					Assert.assertTrue(true, PRODUCT + " is displayed on  Product Title: " + temp);
					
				} else {
					Assert.assertTrue(false, PRODUCT + " is not displayed on Product Title: " + temp);
					

				}

			}

		} catch (Exception e) {
			Assert.assertTrue(false);
			;

		}

	}

}
