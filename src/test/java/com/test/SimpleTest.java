package com.test;
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class SimpleTest {

		private  WebDriver driver;
		
		@BeforeMethod
		public void setUp() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		}
		
		@Test
		public void searchForItemTest() {
		    
			driver.get("http://www.google.com");
			System.out.println("the test is ok");
			
			
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}
