
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderTest
{
	WebDriver driver;
	DataProvider_Pom pom;
	
	
	@BeforeMethod
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		pom = new DataProvider_Pom(driver);
	}
	
	@org.testng.annotations.DataProvider(name="TestData")
	public Object Tdata()
	{		
		Object[][] obj = new Object[3][2];
		obj[0][0] ="u1";
		obj[0][1] ="p1";
		obj[1][0] = "u2";
		obj[1][1] ="p2";
		obj[2][0] ="u3";
		obj[2][1] = "p3";
		
		return obj;
	}
	
	@Test(dataProvider = "TestData")
	public void login(String unam, String  pas) 
	{
		pom.login(unam, pas);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
}
