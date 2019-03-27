 package tests;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Adminpage;
import pages.Loginpage;
import pages.AddnewStudentpage;
import pages.Finalpage;
import pages.Homepage;
import pages.Studentpage;

public class Gluecode1 
{
	  public WebDriver driver;
	  public WebDriverWait wait;
	  public Loginpage lp;
	  public Adminpage ap;
	  public Homepage hp;
	  public Studentpage sp;
	  public AddnewStudentpage asp;
	  public Finalpage fp;
	  public Scenario s;
	  public Properties pro;
	  
	  @Before
	  public void method1(Scenario s)throws Exception
	  {
		  //use scenario object for current scenario
		  this.s=s;
		  //load properties file for current scenario
		  pro=new Properties();
		  FileInputStream fip=new FileInputStream("E:\\leelajava\\sisdemo1\\src\\test\\resources\\repository\\bddpropertiesfile.properties");
		  pro.load(fip);
	  }
	  @Given("^launch site$")
	  public void method2()
	  {
		System.setProperty("webdriver.chrome.driver",pro.getProperty("cdriver"));
	    driver=new ChromeDriver();
	    driver.get(pro.getProperty("url"));
		// create objects for page classes for current scenario
	    ap=new Adminpage(driver);
    	lp=new Loginpage(driver);
    	hp=new Homepage(driver);
    	sp=new Studentpage(driver);
    	asp=new AddnewStudentpage(driver);
    	fp=new Finalpage(driver);
		// define wait object
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(ap.admin));
		driver.manage().window().maximize();
	  }
	  @When("^click on administrator link to login as administrator$")
	  public void method5()
	  {
		  wait.until(ExpectedConditions.visibilityOf(ap.admin));
		  ap.adminclick();
	  }
	  @And("^fill userid and password to login$")
	  public void method6(DataTable dt)throws Exception
	  {
		  List<Map<String,String>> data=dt.asMaps(String.class,String.class);
			  wait.until(ExpectedConditions.visibilityOf(lp.userid));
			  //fill fields
			  String uid=data.get(0).get("userid");
			  String pwd=data.get(0).get("password"); 
			  lp.filluserid(uid);
			  wait.until(ExpectedConditions.visibilityOf(lp.pwd));
			  lp.fillpwd(pwd);
		    
	  }
	  @And("^click on Login button$")
	  public void method7()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(lp.login));
		  lp.loginclick();
	  }
	  @And("^click on Student link$")
	  public void method8()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(hp.student));
		  hp.studentclick();
	  }
	  @And("^click on Add new to register new student$")
	  public void method9()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(sp.addnewstudent));
		  sp.addnewclick();
	  }
	  @And("^fill the below details of student$")
	  public void method10(DataTable dt)
	  {
		  List<Map<String,String>> data=dt.asMaps(String.class,String.class);
		  for(int i=0;i<data.size();i++)
		  {
			    wait.until(ExpectedConditions.visibilityOf(asp.fname));
			    
			    String first_name=data.get(0).get("fname");
			    String middle_name=data.get(0).get("mname");
			    String last_name=data.get(0).get("lname");
			    //String birth_month=data.get(0).get("month");
			    //String birth_year=data.get(0).get("year");
			    //String gender_type=data.get(0).get("gender");
			    String standard_name=data.get(0).get("standard");
			    String occupation_name=data.get(0).get("occupation");
			    String income_amount=data.get(0).get("income");
			    String religion_name=data.get(0).get("religion");
			    String community_name=data.get(0).get("community");
			    String permanent_address=data.get(0).get("paddress");
			    String communication_address=data.get(0).get("caddress");
			    String mother_tongue=data.get(0).get("mothertongue");
			    String mole=data.get(0).get("moles");
			    String aadhar_no=data.get(0).get("aadharno");
			    String section_name=data.get(0).get("section");
			    String roll_no=data.get(0).get("rollno");
			    String last_school_name=data.get(0).get("lastschoolname");
			    String admission_no=data.get(0).get("admissionno");
			    String reg_no=data.get(0).get("regno");
			    String house_name=data.get(0).get("housename");
			    String father_name=data.get(0).get("fathername");
			    String mother_name=data.get(0).get("mothername");
			    String mobile_no=data.get(0).get("mobileno");
			    String area_code=data.get(0).get("areacode");
			    String land_lineno=data.get(0).get("landlineno");
			    String email_id=data.get(0).get("email");
			    String country_name=data.get(0).get("country");
			    String state_name=data.get(0).get("state");
			    String nationality_name=data.get(0).get("nationality");
			    String district_name=data.get(0).get("district");
			    String pin_code=data.get(0).get("pincode");
			    String student_height=data.get(0).get("height");
			    String student_weight=data.get(0).get("weight");
			    String blood_group=data.get(0).get("bloodgroup");
			    String vision_left=data.get(0).get("vleft");
			    String vision_right=data.get(0).get("vright");
			    String teeth_condition=data.get(0).get("teeth");
			    
			    asp.fillFname(first_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.mname));
	            asp.fillMname(middle_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.lname));
	            asp.fillLname(last_name);
	            //wait.until(ExpectedConditions.visibilityOf(asp.dob));
	            //asp.clickdob();
	            wait.until(ExpectedConditions.visibilityOf(asp.gender));
	            asp.selectGender();
	            wait.until(ExpectedConditions.visibilityOf(asp.standard));
	            asp.selectClass();
	            wait.until(ExpectedConditions.visibilityOf(asp.occupation));
	            asp.fillfatheroccupation(occupation_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.income));
	            asp.fillincome(income_amount);
	            wait.until(ExpectedConditions.visibilityOf(asp.religion));
	            asp.selectReligion(religion_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.community));
	            asp.selectCommunity(community_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.paddress));
	            asp.fillpermanentaddress(permanent_address);
	            wait.until(ExpectedConditions.visibilityOf(asp.caddress));
	            asp.fillcommunicationaddress(communication_address);
	            wait.until(ExpectedConditions.visibilityOf(asp.mothertongue));
	            asp.fillmothertongue(mother_tongue);
	            wait.until(ExpectedConditions.visibilityOf(asp.moles));
	            asp.fillmoles(mole);
	            wait.until(ExpectedConditions.visibilityOf(asp.aadharno));
	            asp.fillaadharno(aadhar_no);
	            wait.until(ExpectedConditions.visibilityOf(asp.section));
	            asp.selectSection(section_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.rollno));
	            asp.fillrollno(roll_no);
	            wait.until(ExpectedConditions.visibilityOf(asp.lastschoolname));
	            asp.filllastschoolname(last_school_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.admissionno));
	            asp.filladmissionno(admission_no);
	            wait.until(ExpectedConditions.visibilityOf(asp.regno));
	            asp.fillregno(reg_no);
	            wait.until(ExpectedConditions.visibilityOf(asp.housename));
	            asp.fillhousename(house_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.fathername));
	            asp.fillfathername(father_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.mothername));
	            asp.fillmothername(mother_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.mobileno));
	            asp.fillmobileno(mobile_no);
	            wait.until(ExpectedConditions.visibilityOf(asp.areacode));
	            asp.fillareacode(area_code);
	            wait.until(ExpectedConditions.visibilityOf(asp.landlineno));
	            asp.filllandlineno(land_lineno);
	            wait.until(ExpectedConditions.visibilityOf(asp.email));
	            asp.fillemail(email_id);
	            wait.until(ExpectedConditions.visibilityOf(asp.country));
	            asp.selectCountry(country_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.state));
	            asp.selectState(state_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.nationality));
	            asp.fillnationality(nationality_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.district));
	            asp.filldistrict(district_name);
	            wait.until(ExpectedConditions.visibilityOf(asp.pincode));
	            asp.fillpincode(pin_code);
	            wait.until(ExpectedConditions.visibilityOf(asp.height));
	            asp.fillheight(student_height);
	            wait.until(ExpectedConditions.visibilityOf(asp.weight));
	            asp.fillweight(student_weight);
	            wait.until(ExpectedConditions.visibilityOf(asp.bloodgroup));
	            asp.fillbloodgroup(blood_group);
	            wait.until(ExpectedConditions.visibilityOf(asp.vleft));
	            asp.fillvisionleft(vision_left);
	            wait.until(ExpectedConditions.visibilityOf(asp.vright));
	            asp.fillvisionright(vision_right);
	            wait.until(ExpectedConditions.visibilityOf(asp.teeth));
	            asp.fillteeth(teeth_condition);
		  }
	  }
	  @And("^click save button$")
	  public void method11()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(asp.save));
		  asp.clicksave();
	  }
	  @And("^click on signout$")
	  public void method12()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(fp.signout));
		  fp.clicksignout();
	  }
	  @And("^close site$")
	  public void method14()
	  {
		  wait.until(ExpectedConditions.elementToBeClickable(ap.admin));
		  driver.close();
	  }
}
