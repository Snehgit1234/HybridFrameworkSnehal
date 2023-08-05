package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginSuccessfullPage extends BaseClass{

	@FindBy(xpath="//h3[text()='Login Successfully']")
	private WebElement loginsucess;
	
	public LoginSuccessfullPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getCaptureUrl() {
		
	
	return loginsucess.getText();
	
	}
	
	
	
}
