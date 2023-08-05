package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginSuccessfullPage;

public class LoginSucessPageTest extends BaseClass{
    @Test
	public void vailidatesucessFunctionality()
	{
		LoginSuccessfullPage loginpage=new LoginSuccessfullPage();
		
		String text = loginpage.getCaptureUrl();
		Assert.assertEquals(text,"Login Successfully");
	}
	
	
	
	
}
