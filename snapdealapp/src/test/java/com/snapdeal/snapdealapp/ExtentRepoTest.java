package com.snapdeal.snapdealapp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class ExtentRepoTest {
	WebDriver driver;
	ExtentTest test;
	ExtentReports report;
	

  @Test
  public void verifyTitle() {
	  report= new ExtentReports();
	  testt=report.startTest("VerifyBlogTitle");
  }
}
