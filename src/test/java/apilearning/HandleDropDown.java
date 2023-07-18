package apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
//		1.Launch the target app
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
			 //2. go to Forms
			 MobileElement formsLabel =driver.findElementByAccessibilityId("Forms");
			 formsLabel.click();
			 //3. Click the dropdown element
			 MobileElement dropDownElement =driver.findElementByAccessibilityId("Dropdown");
			 dropDownElement.click();

			 //4. Select the first option
			 MobileElement firstOption =driver.findElementByXPath("//*[@text='webdriver.io is awesome']");
			 firstOption.click();
			 Thread.sleep(3000);


	}

}
