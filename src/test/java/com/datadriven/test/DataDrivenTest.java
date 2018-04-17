package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.exel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		//get data from exel sheet
		Xls_Reader reader=new Xls_Reader("C:\\Users\\purushotham\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\testdata\\FaceBookTestData.xlsx");
        String firstname= reader.getCellData("Details","firstname",2);
        System.out.println(firstname);
        
        String surname= reader.getCellData("Details","surname",2);
        System.out.println(surname);
        
        String mobno= reader.getCellData("Details","mobno",2);
        System.out.println(mobno);
        
        String password= reader.getCellData("Details","password",2);
        System.out.println(password);
		
		
        //webdriver code		
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		/*WebElement number=driver.findElement(By.id("u_0_s"));
		number.clear();
		number.sendKeys(mobno);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']']")).sendKeys(password);
		driver.quit();*/
	
        
	}

}
