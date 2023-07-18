package appiumtest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {
	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) {
		
		try {
			openCalculator();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}

	}
public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy A50");
		cap.setCapability("udid", "R58M75WFWJW");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability("appPackage", "com.wdiodemoapp");
		cap.setCapability("appActivity", "com.wdiodemoapp.MainActivity");
		cap.setCapability("noReset", true);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,cap);
		
		
		System.out.println("Application started...");
}
}
