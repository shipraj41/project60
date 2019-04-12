package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	
	WebDriver driver;
	Properties prop;

	public WebDriver initializebrowser() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\project60\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public String openwebsiteurl()
	{
		String urlname = prop.getProperty("url");
		return urlname;
	}
	
	public void getscreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\screenshots\\" + result + "screenshot.png"));
	}

}
