package PruebasAppium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class SafariTest {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
    	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    	desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
    	URL url = new URL("http://127.0.0.1:4726/wd/hub");
    	driver = new RemoteWebDriver(url, desiredCapabilities);
    	baseUrl = "http://www.intelygenz.com/es/";
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Test
    public void runTest() throws Exception {
        
    	driver.get(baseUrl);
    	driver.findElement(By.linkText("Servicios")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Desarrollo Apps")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("En la nube")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Omnicanal")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Web Apps")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Soporte")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Innovación")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Notas de prensa")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Trabaja con nosotros")).click();
    	Thread.sleep(10000);
    	driver.findElement(By.linkText("Contacto")).click();
    	Thread.sleep(10000);
    	driver.findElement(By.linkText("Casos")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Clientes")).click();
    	Thread.sleep(5000);
    	
   
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}