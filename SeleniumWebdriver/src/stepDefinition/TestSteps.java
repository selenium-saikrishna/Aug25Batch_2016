package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static ChromeDriver driver;
	@Given("^the browser is launched and orangehrm home page is opened$")
	public void the_browser_is_launched_and_orangehrm_home_page_is_opened() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	
	}

	@Then("^it should display Welcome Admin msg$")
	public void it_should_display_Welcome_Admin_msg() throws Throwable {
	    String expmsg="Welcome Admin";
	    String actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(expmsg, actmsg);
	}
	
	
	@When("^I click on Welcome Admin$")
	public void i_click_on_Welcome_Admin() throws Throwable {
		Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.id("welcome")).click();
	}

	@When("^also click on Logout$")
	public void also_click_on_Logout() throws Throwable {
		Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it should come to the home page of OrangeHRM$")
	public void it_should_come_to_the_home_page_of_OrangeHRM() throws Throwable {
	    String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	}
	
	

}
