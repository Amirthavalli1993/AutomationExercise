package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public WebDriver driver;
	public Properties p;
	public Logger log;
	
	@Parameters({"browser", "os"})
	@BeforeClass
	public void setup(String browser, String os) throws IOException
	{
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		log=LogManager.getLogger(this.getClass()); //loading log files
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities cap=new DesiredCapabilities();
			
			//Set the Platform like windows or mac....			
			switch(os.toLowerCase())
			{
				case "windows": cap.setPlatform(Platform.WIN11); break;
				case "mac": 	cap.setPlatform(Platform.MAC); break;
				default: System.out.println("Invalid OS"); return;
			}

			
			//set browser like chrome or edge ....
			switch(browser.toLowerCase())
			{
				case "chrome": cap.setBrowserName("Chrome"); break;
				case "edge": cap.setBrowserName("MicrosoftEdge"); break;
				default: System.out.println("Invalid Browser"); return;
			}
			
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);			
		}
		
		switch(browser.toLowerCase())
		{
			case "chrome": driver=new ChromeDriver(); break;
			case "edge": driver=new EdgeDriver(); break;
			default: System.out.println("Invalid browser"); return;
		
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
