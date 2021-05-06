import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&dsh=S1443208825%3A1613636881012372&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Yogesh");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chavan");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("chavanyogesh86555");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Champion@96");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Champion@96");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("9766974252");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).clear();
		//driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//button[@jsname=\"LgbsSe\"])[3]")).click();
	}
}
