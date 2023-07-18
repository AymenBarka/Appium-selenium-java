package models.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class LoginPages {

	
	private AppiumDriver<MobileElement> appiumDriver;
	private final By  username_txt= MobileBy.AccessibilityId("input-email");
	private final By password_txt= MobileBy.AccessibilityId("input-password");
	private final By  loginBtn= MobileBy.AccessibilityId("button-LOGIN");
	
	
	
	public LoginPages(AppiumDriver<MobileElement> appiumDriver) {
		
		this.appiumDriver=appiumDriver;
		
		
	}
	public  AppiumDriver<MobileElement> getAppiumDriver(){
		return appiumDriver;
	};
	
	public MobileElement username() {
		return appiumDriver.findElement(username_txt);
	};
	
	public void inputUsername(String username) {
		this .username().sendKeys(username);
	}
	
	public MobileElement password() {
		return appiumDriver.findElement(password_txt);
	};
	public void inputPassword(String password) {
		this .password().sendKeys(password);
	};
	
	
	public MobileElement loginbtn() {
		return appiumDriver.findElement(loginBtn);
	};
	
	public void  clickOnLoginButton() {
		this.loginbtn().click();
	}
	
	
}
