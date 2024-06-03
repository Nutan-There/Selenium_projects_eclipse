package com.testng;

import org.testng.annotations.Test;

public class Threadpool {
  
  @Test (priority=0 ,invocationCount=8,threadPoolSize=2)
  public void log() {
	  System.out.println("log method");
	  System.out.println("thread Id: " +Thread.currentThread().getId());
	  
  }
  @Test (priority=1)
  public void search() {
	  System.out.println("Search method");
  }
  @Test (priority=2)
  public void addtocart() {
	  System.out.println("add to cart method");
  }
  @Test (priority=3)
  public void checkout() {
	  System.out.println("checkout method");
  }
}
