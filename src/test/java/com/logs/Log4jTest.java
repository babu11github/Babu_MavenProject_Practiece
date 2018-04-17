package com.logs;

import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Log4jTest {
		WebDriver driver;
		Logger log= Logger.getLogger(Log4jTest.class);
		@BeforeMethod
		public void setUp()
		{
			log.info("launching browser");
			System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			log.fatal("this is fatal message");
			
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		

		@Test
		public void testBrowserHistory() throws Exception
		{
			log.debug("there no debugs");
			driver.navigate().to("http://www.seleniumhq.org/");
			driver.findElement(By.linkText("Download")).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			log.warn("definetely close the broweser ");
			
			
		}

	}



