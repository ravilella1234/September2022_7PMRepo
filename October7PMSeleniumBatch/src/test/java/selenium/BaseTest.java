package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		if(p.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}

}
