import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataProvider_Pom 
{
	@FindBy(id = "email") private WebElement Uname;
	@FindBy(id= "pass") private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginBtn;
	
	public DataProvider_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname,String pass)
	{
		Uname.sendKeys(uname);
		Pass.sendKeys(pass);
		LoginBtn.click();
	}
}
