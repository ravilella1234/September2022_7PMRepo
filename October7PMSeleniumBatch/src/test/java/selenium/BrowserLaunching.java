package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\update\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1 = new FirefoxDriver();
		
		//webdriver.gecko.driver
		//webdriver.ie.driver
		//webdriver.edge.driver
	}

}
