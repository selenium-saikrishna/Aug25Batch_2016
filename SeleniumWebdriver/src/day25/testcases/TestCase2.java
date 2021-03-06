package day25.testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day25.pageclasses.LeftMenu;
import day25.pageclasses.RegisterMercuryTours;
import day25.pageclasses.WelcomeMercuryTours;

public class TestCase2 {
	@Test
	public void registration()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//page class objects
		WelcomeMercuryTours wm=PageFactory.initElements
				                      (driver,WelcomeMercuryTours.class);
		RegisterMercuryTours rm=PageFactory.initElements
				                     (driver,RegisterMercuryTours.class);
		LeftMenu lm=PageFactory.initElements
				                          (driver,LeftMenu.class);
		wm.register();
		rm.contactInformation();
		lm.home();
		wm.findAFlight("Admin","Admin@123");
	}

}







