package apilearning;


import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class HandleMultipleMatchedElements {

	public static void main(String[] args) {

		//Start an appium session
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
		
		//click on login label
		
		MobileElement loginLabel = driver.findElementByAccessibilityId("Login");
		loginLabel.click();
		//Find elements those are matched //*[@text="Login"]
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.numberOfElementsToBe(MobileBy.xpath("//*[@text='Login']"), 2));
		List<MobileElement> logintextelements = driver.findElementsByXPath("//*[@text='Login']");

	
		System.out.println("How many elements matched : " + logintextelements.size());
		final int LOGIN_TEXT_FORM_INDEX=0;
		final int LOGIN_MENU_TEXT_INDEX=1;
		
		logintextelements.get(LOGIN_MENU_TEXT_INDEX).click();
		logintextelements.get(LOGIN_MENU_TEXT_INDEX).getText();
	}

}
