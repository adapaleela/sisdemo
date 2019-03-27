package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage 
{
	  public WebDriver driver;
	  
	  @FindBy(linkText="Administrator")
	  public WebElement admin;
	  
	  public Adminpage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  public void adminclick()
	  {
		  admin.click();
	  }
	
} 
