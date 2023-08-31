package ISuiteListener;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass22 {
	@AfterTest
	public void after_test22() {
		System.out.println("Iam after test function from testclass22");
	}
	@BeforeTest
	public void before_test22() {
		System.out.println("iam Before test function before testclass22");
	}
	@Test
	public void test_pack22() {
		System.out.println("test function from testclass22");
}
}