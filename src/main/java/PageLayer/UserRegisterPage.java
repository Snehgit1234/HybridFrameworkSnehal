package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import static UtilsLayer.HandleDropDown.*;
import static UtilsLayer.UtilsClass.sendKeys;
import static UtilsLayer.UtilsClass.click;
import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;
public class UserRegisterPage extends BaseClass{

	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement Phone; 
	
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="address1")
	private WebElement add;
	
	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="postalCode")
	private WebElement PostalCode;
	
	@FindBy(name="country")
	private WebElement Country;
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Pass;
	
	@FindBy(name="confirmPassword")
	private WebElement Cpass;

	@FindBy(name="submit")
	private WebElement submitbutton;
	
	
	public  UserRegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void RegisterPageFunctionality(String fname1,String lname1,String phone1,String username2,String add1,String city1,String state1,String postalcode1,String country1,String user1,String pass1,String cpass1) {
	  
		sendKeys(fname,fname1);
		sendKeys(lname,lname1);
		sendKeys(Phone,phone1);
		sendKeys(username,username2);
	    sendKeys(add,add1);
	    sendKeys(City,city1);
	    sendKeys(State,state1);
	    sendKeys(PostalCode,postalcode1);
	    selectByVisibleText(Country,country1);
	    sendKeys(Email,user1);
	    sendKeys(Pass,pass1);
	    sendKeys(Cpass,cpass1);
	    
		click(submitbutton);
	}
	{
	 	
		
		
		
		
		
	}
	
	
	
	
}
