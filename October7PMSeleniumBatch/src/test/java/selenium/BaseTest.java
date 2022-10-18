package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir")+"//src//test//resources//";
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		
		fis = new FileInputStream(projectPath+"environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("amazonurl");
		System.out.println(url);
		
		System.out.println(System.getProperty("user.dir"));
		fis = new FileInputStream(projectPath+"data.properties");
		p = new Properties();
		p.load(fis);
		//String val = p.getProperty("firefoxbrowser");
		//System.out.println(val);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 21");
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			//option.addArguments("--proxy-server=https://192.168.10.1:9090");
			//option.addArguments("--ignore-certificate-errors-spki-list");
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox")) 
		{
			
			//FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
		//driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void clickElement(String locator) 
	{
		driver.findElement(By.xpath(locator)).click();
	}

	public static void typeText(String locator, String text) 
	{
		driver.findElement(By.id(locator)).sendKeys(text);
	}

	public static void selectOption(String locator, String option) 
	{
		driver.findElement(By.id(locator)).sendKeys(option);
	}

}
