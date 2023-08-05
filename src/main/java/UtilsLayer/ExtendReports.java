package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtendReports extends BaseClass{
    
	public static ExtentReports extendReportsSetup(String ReportName)
	{
		String path=System.getProperty("user.dir")+"//ExtendReports//"+ReportName+date()+".html";
		ExtentSparkReporter extendsparkreporter=new ExtentSparkReporter(path);
	    ExtentReports extentreport=new ExtentReports();
	    extentreport.attachReporter(extendsparkreporter);
	    return extentreport;
	
	}
	
	public static String date()
	{
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	
	
	}
	
	
	public static String TakesScreenShot(String folderName,String ScreenShotName) throws Exception
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Path=System.getProperty("user,dir")+"//"+folderName+"//"+ScreenShotName+date()+".png";
	    FileUtils.copyFile(f, new File(Path));
	    return Path;
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

