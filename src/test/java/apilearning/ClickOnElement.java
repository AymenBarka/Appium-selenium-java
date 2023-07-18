package apilearning;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class ClickOnElement {


	public static void main(String[] args) {
		
	//	1.Launch the target app
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();

		//2.Click on login label
			MobileElement loginLabel = driver.findElementByAccessibilityId("Login");
			loginLabel.click();
           //3.Input email
			MobileElement email_txt = driver.findElementByAccessibilityId("input-email");
			email_txt.sendKeys("aymenbarka@yahoo.fr");
			//4.Input password
			MobileElement password_txt = driver.findElementByAccessibilityId("input-password");
			password_txt.sendKeys("azertyui");
			//5.Click on login  button
			
			MobileElement btn = driver.findElementByAccessibilityId("button-LOGIN");
			btn.click();

			
		
	}

}
