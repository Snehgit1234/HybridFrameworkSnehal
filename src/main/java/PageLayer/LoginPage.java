package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="userName")
	private WebElement fname;
	
	@FindBy(name="password")
	private WebElement passw;
	
	@FindBy(name="submit")
	private WebElement Submit;

	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginPageFunctionality(String u1,String p1)
	{
		sendKeys(fname,u1);
		sendKeys(passw,p1);
		click(Submit);
	}
	
	
	
	
	
	
	
	
	
}
