package com.datadriven.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.Utility;

public class DataProviderTest {
WebDriver driver;
@BeforeMethod
public void serUp()
{
	System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
}
@DataProvider
public java.util.Iterator<Object[]> getTestData()
{
ArrayList<Object[]>	testdata = Utility.grtDataFromExcel();
return testdata.iterator();

}
@Test(dataProvider="getTestData")
public void faceBooKLogin(String firstname,String surname  )
{
	 driver.findElement(By.name("firstname")).clear();
     driver.findElement(By.name("firstname")).sendKeys(firstname);
     
     driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(surname);
}
@AfterMethod
public void tearDown(){
	driver.quit();
}
}
