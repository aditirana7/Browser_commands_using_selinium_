package com.Browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserCommands {
	WebDriver driver;
	@Test
	public void BrowserCommandTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}
}
