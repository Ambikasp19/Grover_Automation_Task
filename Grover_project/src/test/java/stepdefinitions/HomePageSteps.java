package stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.pages.Cartpage;
import com.pages.Homepage;
import com.pages.Mobilescreen;
import com.pages.Signup_page;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	Homepage homePage = new Homepage(DriverFactory.getDriver());
	ConfigReader configReader;
	Properties prop;

	WebDriver driver;
	String UserName;
	String Password;

	Cartpage cartage = new Cartpage(DriverFactory.getDriver());
	Signup_page signup = new Signup_page(DriverFactory.getDriver());
	Mobilescreen screen = new Mobilescreen(DriverFactory.getDriver());;
	String PRODUCT = "Samsung";

	@When("^I search Product Samsung$")

	public void i_search_product_samsung() throws Throwable {

		homePage.Search_product(PRODUCT);
	}

	@Then("^the Appropriate search should contain the search input$")
	public void the_appropriate_search_should_contain_the_search_input() throws Throwable {
		signup.verify_test();
	}

	@When("^I click on Cart Button$")
	public void i_click_on_cart_button() throws Throwable {

		cartage.click_continue();

	}

	@And("^I Enter Sign_up Details$")
	public void i_enter_signup_details() throws Throwable {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		UserName = prop.getProperty("username");
		Password = prop.getProperty("password");
		signup.username(UserName);
		signup.password(Password);

	}

	@And("^Mobile confirmation should display$")
	public void mobile_confirmation_should_display() throws Throwable {
		screen.verify_mobile_screen();
	}

	@And("^I select Mobile country code$")
	public void i_select_mobile_country_code() throws Throwable {

		screen.Dropdown();
	}

	@And("^I Enter Mobile number$")
	public void i_enter_mobile_number() throws Throwable {
		screen.phonenumer("15228522400");
	}

}
