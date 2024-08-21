package comm.navigation_programs;

import org.openqa.selenium.chrome.ChromeDriver;
public class TestNavigation {
	public static void main(String args[]) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.navigate().to("https://auth.hollandandbarrett.com/u/login");
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://www.Yahoo.com/");
		driver.navigate().back();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();//forward
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.quit();

	}
}
