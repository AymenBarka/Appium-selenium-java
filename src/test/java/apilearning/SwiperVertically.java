package apilearning;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.AppiumDriverEx;

public class SwiperVertically {

	public static void main(String[] args) {
		// create a session first
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
		        
			//	 click on  forms screen
				 
				 MobileElement formsLabel =driver.findElementByAccessibilityId("Forms");
				 formsLabel.click();
				 
				 // make sure i'am on the target screen
				 MobileElement switchTextElement =driver.findElementByAccessibilityId("switch-text");

				 WebDriverWait wait = new WebDriverWait(driver,30);
				 wait.until(ExpectedConditions.visibilityOf(switchTextElement));
				 
				 // Get the mobile window size
				 
				 Dimension windowSize = driver.manage().window().getSize();
				 int screenHeight = windowSize.getHeight();
				int screenWidth	=windowSize.getWidth();
				
				//init start point and end points to touch and release
				
				int xStartPoint=70 * screenWidth/ 100;
				int xEndPoint= xStartPoint;
				int yStartPoint=90 * screenHeight/ 100;
				int yEndPoint=10 * screenHeight/ 100;
				 
				//perform the touch actions
				PointOption startPoint = new PointOption().withCoordinates(xStartPoint, yStartPoint);
				PointOption endPoint =new PointOption().withCoordinates(xEndPoint, yEndPoint);
				
				// Scroll up- swipe from button to top
				TouchAction touchAction = new TouchAction(driver);
				touchAction
				.press(startPoint).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(3)))
				.moveTo(endPoint)
				.release()
				.perform();
				
				//Scroll down - swipe from top to button 
				
				touchAction
				.press(endPoint).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(3)))
				.moveTo(startPoint)
				.release()
				.perform();
				
				
				 
				 
	}

}
