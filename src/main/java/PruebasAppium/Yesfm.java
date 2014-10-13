package PruebasAppium;

import io.appium.java_client.AppiumDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.By;


public class Yesfm {
 
	public AppiumDriver driver;
 
    @Before
    public void setUp() throws Exception {
		
    	
    	DesiredCapabilities capabilities = new DesiredCapabilities();
	
    	//Real Device
    	capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "7.1");
		capabilities.setCapability("deviceName", "iPad");
		//capabilities.setCapability("app", "Users/PC1073/Desktop/Pruebas Appium/YesFm03.ipa");
    	
		driver = new AppiumDriver(new URL("http://127.0.0.1:4726/wd/hub"),capabilities);
		
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	
    }

    //Prueba iPad
    @Test
    public void testCases() throws InterruptedException {

    	Thread.sleep(5000);
    	
    	//Login
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("martaigz");
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("martaa");
    	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAKeyboard[1]/UIAButton[1]")).click();
    	Thread.sleep(5000);
		//Menu
		driver.findElement(By.name("Click & Go")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]/UIAActionSheet[1]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[12]/UIAStaticText[1]")).click();
		driver.findElement(By.name("Aceptar")).click();

		Thread.sleep(5000);
		
	//driver.close();
	 driver.quit();
	System.out.println("Fin");
    }
    
    
    @After
    public void tearDown() throws Exception {
   
    	
   
    }

    
}





