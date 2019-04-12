package testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.base;

public class TC1 extends base{
	
	WebDriver driver;
	public static Logger log = LogManager.getLogger(TC1.class.getName());
	
	@Test
	public void openbrowser() throws IOException
	{
		log.debug("initializing browser");
		driver = initializebrowser();
		log.info("browser is successfully opened");
	}
	
	@Test
	public void openurl()
	{
		log.debug("url is getting opened");
		driver.get(openwebsiteurl());
		log.info("url is successfully opened");
	}
	
	@AfterTest
	public void closedriver()
	{
		log.debug("driver is getting closed");
		driver.close();
		log.info("driver is successfully closed");
	}

}
