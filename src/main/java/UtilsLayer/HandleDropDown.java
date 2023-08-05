package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass
{

	public static  void selectByVisibleText(WebElement a,String value)
	
	{
		Select sel=new Select(a);
		sel.selectByVisibleText(value);
	}
	public static void findElements(List<WebElement> wb,String value)
	{
		for(WebElement abc:wb) {
			if(abc.getText().equalsIgnoreCase(value))
			{
				abc.click();
				break;
				
			}
		}
	}
		public static void findRadioElements(List<WebElement> ls, String location) {
			for(WebElement abc: ls) {
				String aStr = abc.getAttribute("value");
				if(aStr.equalsIgnoreCase(location)) {
					abc.click();
					break;
				}
			}
		}
	
	
		
		
		
		//"CPV Delhi"
public static void handleRegisterApplyRadioBtn(List<WebElement> wb, String location) {
//	CPV Delhi
	for(WebElement abc: wb) {
		String a = null; //"13"
		String aStr = abc.getAttribute("value");//"13"
		
		if(location.equalsIgnoreCase("CPV Delhi")) { 
			a = "13";
		}else {
			a = "PO"; 
		}
		if(a.equalsIgnoreCase(aStr)) {
			abc.click();
			break;
		}
		
	}
}
}
	
	
	
	

