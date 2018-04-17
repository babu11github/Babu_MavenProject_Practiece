package com.rerun.faiure.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class AnnotationRetry implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method testmethod) {
	IRetryAnalyzer analyzer=annotation.getRetryAnalyzer();
	if(analyzer==null)
	{
		annotation.setRetryAnalyzer(CustomRetryAnalyzer.class);
	}
	
		
	
		
	}

}
