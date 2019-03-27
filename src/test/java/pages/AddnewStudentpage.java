package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddnewStudentpage 
{
	public WebDriver driver;
	
	@FindBy(name="firstName")
	public WebElement fname;
	
	@FindBy(name="middleName")
	public WebElement mname;
	
	@FindBy(name="lastName")
	public WebElement lname;
	
	@FindBy(name="dob")
	public WebElement dob;
	
	@FindBy(xpath="//*[@data-handler='selectMonth']")
	public WebElement month;
	
	@FindBy(xpath="//*[@data-handler='selectYear']")
	public WebElement year;
	
	@FindBy(linkText="2")
	public WebElement day;
	
	@FindBy(xpath="//*[@name='gender']")
	public WebElement gender;
	
	@FindBy(xpath="//*[@name='class']")
	public WebElement standard;
	
	@FindBy(name="parentOccupation")
	public WebElement occupation;
	
	@FindBy(name="annualIncome")
	public WebElement income;
	
	@FindBy(xpath="//*[@name='religion']")
	public WebElement religion;
	
	@FindBy(xpath="//*[@name='community']")
	public WebElement community;
	
	@FindBy(name="address")
	public WebElement paddress;
	
	@FindBy(name="communicationAddress")
	public WebElement caddress;
	
	@FindBy(name="motherTongue")
	public WebElement mothertongue;
	
	@FindBy(name="indentificationMark")
	public WebElement moles;
	
	@FindBy(name="uid_aadhar")
	public WebElement aadharno;
	
	@FindBy(name="section")
	public WebElement section;
	
	@FindBy(name="rollno")
	public WebElement rollno;
	
	@FindBy(name="schoolLastStudied")
	public WebElement lastschoolname;
	
	@FindBy(name="admissionNo")
	public WebElement admissionno;
	
	@FindBy(name="boardRegNo")
	public WebElement regno;
	
	@FindBy(name="studHouse")
	public WebElement housename;
	
	@FindBy(name="fatherName_first")
	public WebElement fathername;
	
	@FindBy(name="motherName")
	public WebElement mothername;
	
	@FindBy(name="contactNo")
	public WebElement mobileno;
	
	@FindBy(name="areacode")
	public WebElement areacode;
	
	@FindBy(name="mobileNumber")
	public WebElement landlineno;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="countryid")
	public WebElement country;
	
	@FindBy(name="stateid")
	public WebElement state;
	
	@FindBy(name="nationalityid")
	public WebElement nationality;
	
	@FindBy(name="district")
	public WebElement district;
	
	@FindBy(name="pincode")
	public WebElement pincode;
	
	@FindBy(name="studHeight")
	public WebElement height;
	
	@FindBy(name="studWeight")
	public WebElement weight;
	
	@FindBy(name="bloodGroup")
	public WebElement bloodgroup;
	
	@FindBy(name="visionLeft")
	public WebElement vleft;
	
	@FindBy(name="visionRight")
	public WebElement vright;
	
	@FindBy(name="teeth")
	public WebElement teeth;
	
	@FindBy(name="save_user")
	public WebElement save;
	
	 public AddnewStudentpage(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	 public void fillFname(String x)
	  {
		  fname.sendKeys(x);
	  }
	 public void fillMname(String x)
	  {
		  mname.sendKeys(x);
	  }
	 public void fillLname(String x)
	  {
		  lname.sendKeys(x);
	  }
	/* public void clickdob(String x,String y,String z)
	  {
		  dob.click();
		  Select s1=new Select(month);
		  s1.selectByVisibleText(x); 
		  Select s2=new Select(year);
		  s2.selectByVisibleText(y);
		  Select s3=new Select(day);
		  s3.selectByVisibleText(z);
		  day.click();
	  }
	  public void selectMonth(String x)
	  {
		 Select s1=new Select(month);
		 s1.selectByVisibleText(x); 
	  }
	 public void selectYear(String x)
	  {
		 Select s2=new Select(year);
		 s2.selectByValue(x);
	  }*/
	 public void selectGender()
	  {
		
		 Select s=new Select(gender);
		 s.selectByVisibleText("Male");
		 gender.click();
	
	  }
	 public void selectClass()
	  {
		 standard.click();
		 Select s=new Select(standard);
		 s.selectByVisibleText("");
	  }
	 public void fillfatheroccupation(String x)
	  {
		 occupation.sendKeys(x);
	  }
	 public void fillincome(String x)
	  {
		  income.sendKeys(x);
	  }
	 public void selectReligion(String x)
	  {
		 religion.click();
		 Select s=new Select(religion);
		 s.selectByVisibleText(x);
	  }
	 public void selectCommunity(String x)
	  {
		 community.click();
		 Select s=new Select(community);
		 s.selectByVisibleText(x);
	  }
	 public void fillpermanentaddress(String x)
	  {
		  paddress.sendKeys(x);
	  }
	 public void fillcommunicationaddress(String x)
	  {
		  caddress.sendKeys(x);
	  }
	 public void fillmothertongue(String x)
	  {
		 mothertongue.click();
		 Select s=new Select(mothertongue);
		 s.selectByVisibleText(x);
	  }
	 public void fillmoles(String x)
	  {
		  moles.sendKeys(x);
	  }
	 public void fillaadharno(String x)
	  {
		  aadharno.sendKeys(x);
	  }
	 public void selectSection(String x)
	  {
		 section.click();
		 Select s=new Select(section);
		 s.selectByValue(x);
	  }
	 public void fillrollno(String x)
	  {
		  rollno.sendKeys(x);
	  }
	 public void filllastschoolname(String x)
	  {
		  lastschoolname.sendKeys(x);
	  }
	 public void filladmissionno(String x)
	  {
		  admissionno.sendKeys(x);
	  }
	 public void fillregno(String x)
	  {
		  regno.sendKeys(x);
	  }
	 public void fillhousename(String x)
	  {
		  housename.sendKeys(x);
	  }
	 public void fillfathername(String x)
	  {
		  fathername.sendKeys(x);
	  }
	 public void fillmothername(String x)
	  {
		  mothername.sendKeys(x);
	  }
	 public void fillmobileno(String x)
	  {
		  mobileno.sendKeys(x);
	  }
	 public void fillareacode(String x)
	  {
		  areacode.sendKeys(x);
	  }
	 public void filllandlineno(String x)
	  {
		  landlineno.sendKeys(x);
	  }
	 public void fillemail(String x)
	  {
		  email.sendKeys(x);
	  }
	 public void selectCountry(String x)
	  {
		 country.click();
		 Select s=new Select(country);
		 s.selectByVisibleText("India");
	  }
	 public void selectState(String x)
	  {
		 state.click();
		 Select s=new Select(state);
		 s.selectByVisibleText("India");
	  }
	 public void fillnationality(String x)
	  {
		  nationality.sendKeys(x);
	  }
	 public void filldistrict(String x)
	  {
		  district.sendKeys(x);
	  }
	 public void fillpincode(String x)
	  {
		  pincode.sendKeys(x);
	  }
	 public void fillheight(String x)
	  {
		  height.sendKeys(x);
	  }
	 public void fillweight(String x)
	  {
		  weight.sendKeys(x);
	  }
	 public void fillbloodgroup(String x)
	  {
		   bloodgroup.sendKeys(x);
	  }
	 public void fillvisionleft(String x)
	  {
		  vleft.sendKeys(x);
	  }
	 public void fillvisionright(String x)
	  {
		  vright.sendKeys(x);
	  }
	 public void fillteeth(String x)
	  {
		  teeth.sendKeys(x);
	  }
	 public void clicksave()
	  {
		  save.click();;
	  }
	 
	
}
