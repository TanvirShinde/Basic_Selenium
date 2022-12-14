package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotations {
	
	
	@BeforeTest
	public void beforeTest () {
		
		System.out.println("Before test annotation");
	}

	@Test
	public void case1 () {
		
		Reporter.log("Test Case 1 from Sample 3 class" , true);
	}
	@Test
	public void case2 () {
		
		Reporter.log("Test Case 2  from Sample 3 class" , true);
	}
	

	@AfterTest
	public void afterTest () {
		
		System.out.println("After test annotation");
	}


	
	
}
