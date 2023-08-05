package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
   @Test
	public void ValidateLoginPage()
	{
		LoginPage loginpage=new LoginPage();
		loginpage.LoginPageFunctionality("snehal@3","1325s");
	}
	
	
	
	
	
}
