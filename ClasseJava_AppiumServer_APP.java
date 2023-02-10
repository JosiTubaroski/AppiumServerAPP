
import io.appium.java_client.MobileElement; 
import io.appium.java_client.android.AndroidDriver; 
import junit.framework.TestCase; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
import java.net.MalformedURLException; 
import java.net.URL; 
import org.openqa.selenium.remote.DesiredCapabilities; 

public class SampleTest { private AndroidDriver driver; 

@Before public void setUp() throws MalformedURLException 
{ DesiredCapabilities desiredCapabilities = new DesiredCapabilities(); 

desiredCapabilities.setCapability("platformName", "Android"); 
desiredCapabilities.setCapability("deviceName", "emulator-5554"); 
desiredCapabilities.setCapability("automationName", "uiautomator2"); 
desiredCapabilities.setCapability("appPackage", "com.android.calculator2"); 
desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator"); 
desiredCapabilities.setCapability("ensureWebviewsHavePages", true); 
URL remoteUrl = new URL("http://localhost:4723/wd/hub"); 

driver = new AndroidDriver(remoteUrl, desiredCapabilities); } 

@Test public void sampleTest() 

{ 

MobileElement el11 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2"); el11.click(); 

MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("plus"); el12.click(); 

MobileElement el13 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2"); el13.click(); 

MobileElement el14 = (MobileElement) driver.findElementById("com.android.calculator2:id/result"); el14.click();}
 
@After public void tearDown() 
{driver.quit();}}
