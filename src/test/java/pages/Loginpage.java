
package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public WebDriver driver;
	
	@FindBy(name="username")
	public WebElement userid;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(name="admin_login")
	public WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void filluserid(String x)
	{
		 userid.sendKeys(x);
	}
	public void fillpwd(String y)
	{
		 pwd.sendKeys(y);
	}
	public void loginclick()
	{
		 login.click();
	}
}
