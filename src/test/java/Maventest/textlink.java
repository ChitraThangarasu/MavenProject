package Maventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.linkText("Gmail"));
			System.out.println(e1.isDisplayed());
			System.out.println(e1.isEnabled());
			System.out.println(e1.getText());
			e1.click();
			driver.close();
	}

}
