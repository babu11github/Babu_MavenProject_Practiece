package com.test.utility;

import java.util.ArrayList;

import com.exel.utility.Xls_Reader;

public class Utility {
	static Xls_Reader reader;

	public static ArrayList<Object[]> grtDataFromExcel(){
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
	
		try {
			reader=new Xls_Reader("C:\\Users\\purushotham\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\testdata\\FaceBookTestData.xlsx");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		int rowCount=reader.getRowCount("Details");
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			String firstname= reader.getCellData("Details","firstname",rowNum);
			String surname= reader.getCellData("Details","surname",rowNum);
		
		
		Object ab[]= {firstname,surname };
		mydata.add(ab);
		
		

	}
		return mydata;
 }
}