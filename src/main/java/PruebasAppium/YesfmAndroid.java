//package PruebasAppium;
//import io.appium.java_client.AppiumDriver;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class YesfmAndroid {
//	
//	public AppiumDriver driver;
//	
//	@Before
//	public void setup() throws Exception{
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("app", "/Users/PC1073/Desktop/Pruebas Appium/YES FM-v1.06-RELEASE.apk");
//    	capabilities.setCapability("browserName", "Android");
//		capabilities.setCapability("deviceName", "emulator-5554");
//		capabilities.setCapability("appium-version", "1.2");	
//		capabilities.setCapability("platformVersion", "4.4");
//		capabilities.setCapability("platformName", "Android");
//		capabilities.setCapability("appPackage", "com.prisa.yesfm");
//		capabilities.setCapability("appActivity", "com.prisa.yesfm.ui.SplashActivity");
//		//capabilities.setCapability("appWaitActivity", ".Dashboard");
//		driver = new AppiumDriver(new URL("http://127.0.0.1:4726/wd/hub"), capabilities);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//			
//	}
//
//	//Prueba simulador Android
//	@Test
//	public void testIU(){
//	
//		//Login
//		driver.findElement(By.id("com.prisa.yesfm:id/et_nickname")).sendKeys("martaigz");
//		driver.findElement(By.id("com.prisa.yesfm:id/et_password")).sendKeys("martaa");
//		driver.findElement(By.id("com.prisa.yesfm:id/b_ok")).click();
//   
//	}
//		
//	@After
//	public void stopSelendroidServer() {
//		if (driver != null) {
//			driver.quit();
//		}
//	
//	}
//	
//
//	
//
//	
//}