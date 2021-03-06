package AppHooks;

import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	DriverFactory driverFactory;
	WebDriver driver;
	ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop =configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName= prop.getProperty("browser");
		driverFactory =new DriverFactory();
		driver = driverFactory.init_driver(browserName);
	}

	@Before(order = 2)
	public void launchUrl() {
		String url= prop.getProperty("url");
		driverFactory =new DriverFactory();
		driver = driverFactory.launchUrl(url);
	}

	@After(order =0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order=1)
	public void tearDown(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll("", "_");
		byte [] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}
}
