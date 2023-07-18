package testnghooks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_01 {

	@BeforeSuite
	public void loginBeforeSuit() {
		System.out.println("Login_01 Before suite");
	}

	@BeforeTest
    public void loginBeforeTest() {
	System.out.println("----------------Login_01 Before Test");

	}
    @BeforeClass
    public void loginBeforeClass() {
	System.out.println("-------------Login_01 BeforeClass");

}
@AfterSuite
public void loginAfterSuite() {
	System.out.println("Login_01 After suite");

}

@AfterTest
public void loginAfterTest() {
	System.out.println("-------------Login_01 After Test");

}
@AfterClass
public void loginAfterClass() {
	System.out.println("-------------Login_01 After Class");

}

@BeforeMethod
public void beforeMethod() {
	System.out.println("-------------Login_01 Before Method");

}

@AfterMethod
public void afterMethod() {
	System.out.println("-------------Login_01 After Method");

}
@Test
public void LoginWithCorrectCreds() {
	System.out.println("----------this is Login Test");
}
@Test
public void LoginWithIncorrectCreds() {
	System.out.println("----------this is Login Test-Incorrect creds");
}

}
