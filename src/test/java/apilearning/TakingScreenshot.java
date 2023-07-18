package apilearning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class TakingScreenshot {

	public static void main(String[] args) {
		// create a session first
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
        
		 //navigate to forms screen
		 
		 MobileElement formsLabel =driver.findElementByAccessibilityId("Forms");
		 formsLabel.click();
		 
		 // click on toggle button if  it's OFF
		 MobileElement switchElement =driver.findElementByAccessibilityId("switch");
		 MobileElement switchTextElement =driver.findElementByAccessibilityId("switch-text");
         final boolean isSwitchOn= switchTextElement.getText().equals("click to turn the switch OFF");
         if(!isSwitchOn) {
        	 switchElement.click();
        	 
        	 // click on dropDown menu ---->select the first option
        	 MobileElement dropDownElement =driver.findElementByAccessibilityId("Dropdown");
			 dropDownElement.click();
			 
			 //Select the first opton
			 
			 MobileElement firstOption =driver.findElementByXPath("//*[@text='webdriver.io is awesome']");
			 firstOption.click();
			 
			 //taking 	a screenshot
			 File formsScreendBase64Data=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 String formScreenFilePath =System.getProperty("user.dir") + "/screenshot/" +"formsScreen.png";
			 
			 try {
				FileUtils.copyFile(formsScreendBase64Data, new File(formScreenFilePath));
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
			 
         }
         

	}

}
