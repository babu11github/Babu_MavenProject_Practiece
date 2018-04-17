package com.datadriven.test;

import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class WriteDataInPropertiesFile {
	public static  Properties prop;
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		 prop=new Properties();
		FileOutputStream fos=new FileOutputStream("C:\\Users\\purushotham\\eclipse-workspace\\MavenProject\\src\\test\\java\\write.properties");
		
		//write the data properties file
		 prop.setProperty("username", "babuyadav2323");
	     prop.setProperty("url"," www.google.com");
	     prop.setProperty("password", "1234");
	     prop.setProperty("browser","chrome");
	   
	     prop.store(fos,"sucessfully added data");
       

	}
}


