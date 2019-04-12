package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id='et_pb_contact_name_0']")
	WebElement name;
	
	By message = By.cssSelector("textarea[id='et_pb_contact_message_0']");
	
	public WebElement entername()
	{
		return name;
	}
	
	public WebElement entermessage()
	{
		return driver.findElement(message);
	}
	

}
