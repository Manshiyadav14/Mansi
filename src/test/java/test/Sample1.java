package test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.netty.handler.codec.http.HttpContentEncoder.Result;
import utility.Reports;

// @Listeners(utility.Listeners.class)

public class Sample1 {
	 ExtentReports reports;
	 ExtentTest test;
	 
	 @BeforeTest
	 public void configureReports() {                                  //generate report
		 reports = Reports.createExtentReports();
	 }
	 
	 
	@Test
	public void test1() {
		test = reports.createTest("test1");
		System.out.println("Test 1");
		
		}
	
	@Test(dependsOnMethods="test3")
	public void test2() {
		test = reports.createTest("test2");
		System.out.println("Test 2");
	}
	
	@Test (timeOut = 1000)
	public void test3() throws InterruptedException {
		test = reports.createTest("test3");
		Thread.sleep(2000);
		System.out.println("Test 3");
	}
		
		@AfterMethod
		public void publishResult(ITestResult result) {
			if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, result.getName());
			}
			else if(result.getStatus()==ITestResult.FAILURE)
{           test.log(Status.FAIL, result.getName());
	          }
               else {
            	   test.log(Status.SKIP, result.getName());
            	   }
			}
		@AfterTest
		public void createReport()  {         //send to template
			reports.flush();
		}

}
