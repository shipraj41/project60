package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.loginpage;
import resources.base;

public class TC2 extends base{
	
	WebDriver driver;
	
	@Test
	public void logincheck() throws IOException
	{
		driver = initializebrowser();
		driver.get(openwebsiteurl());
		
		loginpage lp = new loginpage(driver);
		lp.entername().sendKeys("shipra");
		lp.entermessage().sendKeys("Hello I am Shipra");
	}

}
