package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterSuccessPage;


public class RegisterSuccessPageTest extends BaseClass{

	RegisterSuccessPage register;

	@Test(priority = 1)
	public void validateSuccessPageUrl() {
		register = new RegisterSuccessPage();
		String actualUrl = register. getCurrentUrl1();
		
	}

	@Test(priority = 2)
	public void clickOntheSignUpLinkInSuccessPage() {
		register.clickOnSignUpLink();
	}
}
	
	

