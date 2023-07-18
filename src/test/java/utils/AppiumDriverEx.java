package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverEx {

	public static AndroidDriver<MobileElement>getAndroidDriver(){
		
		// Driver instance
		 AndroidDriver<MobileElement> driver=null;

		try {
			

			
			//setCapabilities to send to appium server
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityTypeEx.DEVICE_NAME, "Galaxy A50");
			cap.setCapability(MobileCapabilityTypeEx.UDID, "R58M75WFWJW");
			cap.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityTypeEx.PLATFORM_VERSION, "11.0");
			cap.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.wdiodemoapp");
			cap.setCapability(MobileCapabilityTypeEx.APP_Activity, "com.wdiodemoapp.MainActivity");
			cap.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, 120);

			cap.setCapability("noReset", true);
			cap.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME, "UiAutomator2");

	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AndroidDriver<MobileElement>(url,cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			MobileElement loginLabel = driver.findElementByAccessibilityId("Login");
			loginLabel.click();

			
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return driver;
	}
}
