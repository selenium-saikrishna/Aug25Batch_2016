package day25.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours {
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement email;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement submit;
	public void contactInformation()
	{
		firstName.sendKeys("Sai");
		lastName.sendKeys("Krishna");
		phone.sendKeys("12345");
		email.sendKeys("sai@gmail.com");
		address.sendKeys("12-3-4-4");
		city.sendKeys("Hyd");
		state.sendKeys("TS");
		postalCode.sendKeys("22222");
		country.sendKeys("INDIA");
		userName.sendKeys("Admin");
		password.sendKeys("Admin@123");
		confirmPassword.sendKeys("Admin@123");
		submit.click();
	}
}

