package Maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Sample1 {
WebDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	@Test
	public void verify1() throws Exception {
		driver.get("https://www.google.com");
		String url=driver.getTitle();
		Assert.assertEquals(url, "Google");
		Thread.sleep(1000);
		}

	

	
	

		
		
	}

