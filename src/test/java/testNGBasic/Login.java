package testNGBasic;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import models.pages.HomePage;
import models.pages.LoginPages;
import utils.AppiumDriverEx;

public class Login {
	
	
	
    @Test
	public void loginWithValidCredentiels() {
		
		
		//Start an appium session
		AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
		
			//2.Click on login label
		    HomePage home = new HomePage(driver);
		    home.LoginHomeBtn();
		     
		     //3.Input email
		     
		     LoginPages page = new LoginPages(driver);
				page.inputUsername("aymenbarka@yahoo.fr");
				
				//4.Input password
				page.inputPassword("azertyui");
				
				//5.Click on login  button
				
				page.clickOnLoginButton();

	}
	
		

}
