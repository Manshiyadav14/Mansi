package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

        public class Listeners extends BaseClass implements ITestListener {
        	
        public void onTestStart(ITestResult Result) {
        	System.out.println("Test Started") ; 
        }
        public void onTestSuccess(ITestResult result) {
        	System.out.println("Test is passed");
				}
        public void onTestFailure(ITestResult result) {
        	System.out.println("Test Failed" +result.getName());
//        	try {
//				Screenshot.UserdefinedScreenshot(driver, result.getName());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		
        	
        }
        public void onTestSkipped(ITestResult result) {
        	System.out.println("Test Skipped");
        }
}
