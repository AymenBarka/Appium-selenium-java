package models.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class HomePage {

	
	private AppiumDriver<MobileElement> appiumDriver;
	
	private final By  LoginLink= MobileBy.AccessibilityId("Login");

	public HomePage(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver=appiumDriver;

	}
	public  AppiumDriver<MobileElement> getAppiumDriver(){
		return appiumDriver;
	};
	public MobileElement LoginHomeBtn() {
		return appiumDriver.findElement(LoginLink);
	};
	
	
	

}
