package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import static UtilsLayer.HandleDropDown.*;
import BaseLayer.BaseClass;

public class RegisterSuccessPage extends BaseClass{


	@FindBy(xpath = "//a[text()=' sign-in ']")
	private WebElement link;

	public RegisterSuccessPage() {
		PageFactory.initElements(driver, this);
	}

	
	

	public String getCurrentUrl1() {
		
		return getCurrentUrl1();
	}

	public void clickOnSignUpLink() {
		click(link);
	}



	}
	
	
	
