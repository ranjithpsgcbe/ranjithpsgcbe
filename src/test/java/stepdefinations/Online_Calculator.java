package stepdefinations;

import com.aventstack.extentreports.Status;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utility.Hook;

public class Online_Calculator {

	private WebDriver driver;

	
	public Online_Calculator() {
		this.driver = Hook.getDriver();
	}

	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {

		System.out.println("Browser is opened successfully");
	}

	@When("^I navigate to Online Calculator page$")
	public void i_navigate_to_Online_Calculator_page() throws Throwable {
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		driver.manage().window().maximize();
		Reporter.addStepLog(Status.PASS+" Browser Launch");
		Hook.takeSnapShot(driver, "Screenshot//test1.png") ;
	}


	@Then("^I Subtract of two numbers$")
	public void i_validate_the_search_text_field() throws Throwable {

		Actions action = new Actions(driver);
		action.sendKeys(Keys.NUMPAD9).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.SUBTRACT).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD4).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);


	}

	@Then("^I Divide two numbers$")
	public void i_validate_the_Gmail_Link() throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.NUMPAD5).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.DIVIDE).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD5).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);

	}

	@Then("^I Enter CE Button$")
	public void i_validate_the_Image_Link() throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.NUMPAD5).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD6).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD8).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.chord("C")).build().perform();
		Thread.sleep(5000);

	}
	
	@When("^Verify the \"([^\"]*)\" Screenshot$")
	public void i_enter_in_search_keyword(String Screenshoot) throws Throwable {
		Hook.takeSnapShot(driver, "Screenshot//"+Screenshoot+".png") ;
		Thread.sleep(5000);
	}

	@And("^I Validate Negative Scenario$")
	public void i_validate_searched_text() throws Throwable {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.NUMPAD5).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD6).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD8).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.DIVIDE).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.NUMPAD0).build().perform();
		Thread.sleep(500);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);

	}
}
