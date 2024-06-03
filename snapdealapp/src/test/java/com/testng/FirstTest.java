package com.testng;

import org.testng.annotations.Test;

public class FirstTest {
  @Test (priority=-1 ,invocationCount=3)
  public void log() {
	  System.out.println("log method");
	  
  }
  @Test (priority=0)
  public void search() {
	  System.out.println("Search method");
  }
  @Test (priority=1)
  public void addtocart() {
	  System.out.println("add to cart method");
  }
  @Test (priority=2 ,enabled=false)
  public void checkout() {
	  System.out.println("checkout method");
  }
}
