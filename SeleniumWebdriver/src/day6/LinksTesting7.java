package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting7 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links count is "+links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			//skip the hidden links
			if(links.get(i).isDisplayed())
			{
				count++;
			}
		}
		System.out.println("Visible links count is  "+count);
		System.out.println("Hidden links count is "+(links.size()-count));
		driver.close();
		
		
		
		
		

	}

}
