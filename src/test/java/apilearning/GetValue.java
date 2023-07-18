package apilearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.AppiumDriverEx;

public class GetValue {

	public static void main(String[] args) {
		       
		
		        //Start an appium session
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
				
				//get the title from the text
				MobileElement successTitle = driver.findElement(By.id("android:id/alertTitle"));
                System.out.println("Title : " +successTitle.getText());
				
	}

}
