package testPractice;

import org.testng.annotations.Test;


import utilities.DriverSetup;
import utilities.screenshots;

public class Test1 extends DriverSetup {
	
	@Test
	public void m1() throws Exception
	{
		System.out.println("this is testing");
		driver.get("https://www.google.com");
		screenshots.takeSnapShot(driver);
		driver.quit();
		
	}

}
