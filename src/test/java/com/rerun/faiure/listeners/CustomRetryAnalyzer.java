package com.rerun.faiure.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer {
	int retryCount = 0 ;
	int maxRetryCount=4;
	@Override
	public boolean retry(ITestResult result) {
		
        if(ITestResult.FAILURE==result.getStatus()&& retryCount<=maxRetryCount)
        {
        
        	try {
				System.out.println("count is:"+retryCount+"executing tc:"+result.getName());
				retryCount++;
				return true;
			}
        	catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		return false;
			}

}
