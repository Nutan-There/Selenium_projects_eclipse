package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String testname= result.getName();
		System.out.println(testname+ " test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ " successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ " Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ " TestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ " TestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+ " TestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		String testname= context.getName();
		System.out.println(testname+ " Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		String testname= context.getName();
		System.out.println(testname+ " Finish");
	}

	

}
