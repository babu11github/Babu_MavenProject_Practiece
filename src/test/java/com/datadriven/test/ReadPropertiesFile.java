package com.datadriven.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {
	public static  Properties prop;
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\purushotham\\eclipse-workspace\\MavenProject\\src\\test\\java\\config.properties");
		prop.load(fis);
		//read the data properties file
		String browsename = prop.getProperty("browser");
		
		String url = prop.getProperty("url");
		
		String username=prop.getProperty("username");
		
		String pwd = prop.getProperty("password");
		
       if(browsename.equals("FF"))
       {
    	   System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
   		 driver = new FirefoxDriver();
   		 
       }else if(browsename.equals("chrome"))
       {
    	   System.setProperty("webdriver.chrome.driver","D:\\selenium\\Lib\\bin\\chromedriver.exe");
     		 driver = new FirefoxDriver();
       }
       
       driver.get(url);
       driver.findElement(By.xpath(prop.getProperty("us_id"))).sendKeys(prop.getProperty("username"));
       driver.findElement(By.xpath(prop.getProperty("pass_id"))).sendKeys(prop.getProperty("password"));
       
       driver.quit();
       
	}

}
