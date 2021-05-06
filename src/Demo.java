import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cybage.com/");
		Thread.sleep(4000);
		WebElement wallpeper = driver.findElement(By.xpath("//h2[text()='WHITEPAPERS']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",wallpeper);
//		Thread.sleep(2000);
//		WebElement INDUSTRIES = driver.findElement(By.xpath("//h2[text()='INDUSTRIES']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",INDUSTRIES);
		driver.findElement(By.xpath("//button[contains(text(),'No, t')]")).click();
	}
	
	
}
