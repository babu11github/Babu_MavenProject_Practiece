package com.datadriven.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.TestResult;

public class ExcelReader implements IAnnotationTransformer{
	
	private static String methodName;
	private static String automationExecution;


	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
       System.out.println("In before method of my Listener...");
		
		automationExecution=getAutomationExecution(methodName){
			
			if(automationExecution.equalsIgnoreCase("NO")) {
				
				annotation.setEnabled(false);
		
				throw new SkipException("Skipping the test case as it was set to NO...");
				
			}
			
		}
		
	}

	

	

}
