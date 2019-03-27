package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//*[contains(text(),'STUDENT')])[2]")
	public WebElement student;
	  
	public Homepage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	public void studentclick()
	  {
		  student.click();
	  }
}
