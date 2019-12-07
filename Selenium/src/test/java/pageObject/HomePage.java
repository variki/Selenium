package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By homelink =By.xpath("//a[contains(text(),'Home')]");
	By signonlink = By.xpath("//a[contains(text(),'SIGN-ON')]");
	By registerFormlink = By.linkText("registration form");
	
	public static void NavigateToRegistrationPage()
	{
		
	}
	
}
