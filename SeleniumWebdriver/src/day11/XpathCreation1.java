package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	@Test
	public void xpathtest()
	{
		String x=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(x);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}


}
