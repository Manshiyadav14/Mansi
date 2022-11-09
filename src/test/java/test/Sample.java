package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility.Listeners.class)

public class Sample {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
		
		}
	@Test(dependsOnMethods="test3")
	public void test2() {
		System.out.println("Test 2");
	}
	@Test (timeOut = 1000)
	public void test3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 3");
	}

}
