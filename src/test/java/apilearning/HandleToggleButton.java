package apilearning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class HandleToggleButton {

	public static void main(String[] args) {
		//	1.Launch the target app
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
		 //2. Click on tghe Forms Button
		 MobileElement formsLabel =driver.findElementByAccessibilityId("Forms");
		 formsLabel.click();
		 //3. Get the toggle button value before interacting with the switch
		 MobileElement switchTextElement =driver.findElementByAccessibilityId("switch-text");
        System.out.println("Label text before interacting with toggle button :  " + switchTextElement.getText());
		 //4. Click on the toggle button
		 MobileElement switchElement =driver.findElementByAccessibilityId("switch");
        switchElement.click();
		 //5. Get the toggle Label value  before interacting 
  System.out.println("Label text after interacting with toggle button  :  " + switchTextElement.getText());

}  



}
