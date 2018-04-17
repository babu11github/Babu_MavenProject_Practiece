package com.rerun.faiure.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RetryTest {
	WebDriver driver;
	SoftAssert softAssert=new SoftAssert();
	@Test//(retryAnalyzer=CustomRetryAnalyzer.class)
	public void loginTest()
	{
		 System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
   		 driver = new FirefoxDriver();
   		 driver.get("https://www.facebook.com/");
         driver.findElement(By.xpath("//input[@type='1email']")).sendKeys("vengababu");
         softAssert.assertEquals(true,true);
         driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("babu11");
         driver.quit();
   		 
	}

}
