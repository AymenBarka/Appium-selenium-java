package testnghooks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp_01 {
	@BeforeSuite
	public void signUpBeforeSuit() {
		System.out.println("SignUp_01 Before suite");
	}

	@BeforeTest
    public void signUpBeforeTest() {
	System.out.println("----------------SignUp_01 Before Test");

	}
    @BeforeClass
    public void signUpBeforeClass() {
	System.out.println("-------------SignUp_01 BeforeClass");

}
@AfterSuite
public void signUpAfterSuite() {
	System.out.println("SignUp_01 After suite");

}

@AfterTest
public void signUpAfterTest() {
	System.out.println("-------------SignUp_011 After Test");

}
@AfterClass
public void signUpAfterClass() {
	System.out.println("-------------SignUp_01 After Class");

}
@Test
public void signUp() {
	System.out.println("----------this is SignUp Test");
}

}
