package Maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginadmin {

	WebDriver driver;
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	@Test(priority=1)
public void login() throws InterruptedException {
		driver.get("http://gcreddy.com/project/admin/login.php");
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.name("username")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.name("password")).isDisplayed(), true);
Assert.assertEquals(driver.findElement(By.id("tdb1")).isDisplayed(), true);
	}
	
	@Test(priority=2)
	public void redirect() {
		driver.findElement(By.linkText("Online Catalog")).click();
		String url=driver.getTitle();
		Assert.assertEquals(url,"GCR Shop");
	
		}
	@Test(priority=3)
	public void adminlog() {
		driver.get("http://gcreddy.com/project/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("tdb1")).click();
	}
	
}
