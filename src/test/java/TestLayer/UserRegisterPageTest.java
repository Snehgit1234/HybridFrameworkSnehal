package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.UserRegisterPage;

public class UserRegisterPageTest extends  BaseClass{
	@BeforeTest
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void validateRegisterPageFunctionality()
	{
		UserRegisterPage user=new UserRegisterPage();
		user.RegisterPageFunctionality("snehal","bhoite","123456776","snehal@34","pune","satara","mh","12345","INDIA","snehal@3","1325s","1325s");
				
	}
	
	
	@AfterTest
	public void tearDown()
	{
		
	}
	
}


