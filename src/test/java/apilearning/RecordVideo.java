package apilearning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;
import utils.AppiumDriverEx;

public class RecordVideo {

	public static void main(String[] args) {
		// create a session first
		
		 AndroidDriver<MobileElement> driver=AppiumDriverEx.getAndroidDriver();
		 
		 // Start recording
		( (CanRecordScreen) driver).startRecordingScreen();
		
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
		
		 //to do something to the test to simulate real user actions
		 
		 // Stop recording
		String video =( (CanRecordScreen) driver).stopRecordingScreen();

		 // save the recorded Data to system
		
		 byte[] decodedVideo= Base64.getMimeDecoder().decode(video);
		 
		 try {
			 Path testVideoDir = Paths.get(System.getProperty("user.dir") + "/videos");

			Files.createDirectories(testVideoDir);
			
			Path testVideoFileLocation = Paths.get(testVideoDir.toString(), String.format("%s-%d.%s","test", System.currentTimeMillis(),"mp4"));
			Files.write(testVideoFileLocation,decodedVideo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
