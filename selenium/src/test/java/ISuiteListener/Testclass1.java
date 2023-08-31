package ISuiteListener;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testclass1 {
	@AfterTest
	public void after_test1() {
		System.out.println("After test function from testclass 1");
	}
	@BeforeClass
	public void before_test1() {
		System.out.println("Before test function from testclass 1");
		
		
	}
    @Test
    public void testpack1() {
    	System.out.println("test function from testclass 1");
    	
    	
    }
}
