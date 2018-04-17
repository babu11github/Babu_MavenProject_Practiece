package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.exel.utility.Xls_Reader;

public class ParamerizedTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\Lib\\bin\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//get the data from excel
		Xls_Reader reader=new Xls_Reader("C:\\Users\\purushotham\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\testdata\\FaceBookTestData.xlsx");
		
		int rowCount=reader.getRowCount("Details");
		//add one cell to ou exel sheet
		reader.addColumn("Details","status");
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			String firstname= reader.getCellData("Details","firstname",rowNum);
	        System.out.println(firstname);
	        
	        String surname= reader.getCellData("Details","surname",rowNum);
	        System.out.println(surname);
	        
	        String mobno= reader.getCellData("Details","mobno",rowNum);
	        System.out.println(mobno);
	        
	        String password= reader.getCellData("Details","password",rowNum);
	        System.out.println(password);
	        //enter values
	        driver.findElement(By.name("firstname")).clear();
	        driver.findElement(By.name("firstname")).sendKeys(firstname);
	        
	        driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("lastname")).sendKeys(surname);
			
			
			/*WebElement number=driver.findElement(By.id("u_0_s"));
			number.clear();
			number.sendKeys(mobno);
			
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
			driver.quit();
			
	        */
			reader.setCellData("Details","status", rowNum,"pass");
		}
	}

}
